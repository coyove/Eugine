function hlTab(id) {
	var e = document.getElementById(id)
	e.style.color = "#eee";
	e.style.backgroundColor = "#758ca8";
}

function hide(id, nowrite) {
	var item = getid("item-" + id);
	var title = item.querySelector(".title");
	var info = item.querySelector(".info");
	var info2 = item.querySelector(".info2");
	var va = item.querySelector(".vote-area");
	var reply = item.querySelector(".reply");

	var hiddens = nowrite ? {} : JSON.parse(localStorage.getItem("hidden_posts") || "{}");

	var hider = info.querySelector(".hider");
	if (hider.getAttribute("state") === "un-hide") {
		hider.innerHTML = info2 ? ("显示 #" + id) : "显示";
		hider.setAttribute("state", "hide");
		display(title, "none");
		hiddens[id] = new Date().getTime();

		display(info2, "none");
		display(va, "none");
		display(reply, "none");
	} else {
		hider.setAttribute("state", "un-hide");
		hider.innerHTML = "隐藏";
		display(title, "block");
		delete hiddens[id];

		display(info2, "block");
		display(va, "table-cell");
		display(reply, "inline");
	}

	if (nowrite) {} else {
		localStorage.setItem("hidden_posts", JSON.stringify(hiddens));
	}
}

function fold(id) {
	var item = getid("item-" + id);
	var info = item.querySelector(".info2");
	if (info) {} else return;
	
	var subitems = document.querySelectorAll("#item-" + id + " > .item");

	var folded = JSON.parse(localStorage.getItem("folded_posts") || "{}");
	var folder = info.querySelector(".folder");

	if (folder.innerHTML == "-") {
		folder.innerHTML = "+" + document.querySelectorAll("#item-" + id + " .item").length;
		folded[id] = new Date().getTime();

		for (var i = 0; i < subitems.length; i++)
			display(subitems[i], "none");
	} else {
		folder.innerHTML = "-";
		delete folded[id];
		for (var i = 0; i < subitems.length; i++)
			display(subitems[i], "block");
	}

	localStorage.setItem("folded_posts", JSON.stringify(folded));
}

function unhideAll() {
	localStorage.setItem("hidden_posts", "{}");
	location.href = "/";
}

function del(id) {
	if (confirm("删除不可逆")) {
		location.href = "/delete/" + id;
	}
}

function display(dom, d) {
	var e = getid(dom);
	if (e) e.style.display = d;
}

function getid(id) {
	if (typeof id === 'string') {
		return document.getElementById(id);
	} else {
		return id;
	}
}

function sayaye(id) {
	location.href = "/aye/" + id;
}

function sayno(id) {
	location.href = "/no/" + id;
}

function purgeStorage(name) {
	var hiddens = JSON.parse(localStorage.getItem(name) || "{}");
	var now = new Date().getTime();
	for (var id in hiddens) {
		if (now - hiddens[id] > 86400000 * 7) {
			delete hiddens[id];
		}
	}
	localStorage.setItem(name, JSON.stringify(hiddens));
	return hiddens;
}

window.onload = function() {
	var _extra = function (text) {
		getid('memberinfo').className = "";
		getid('memberinfo').innerHTML = text;
		hlTab("memberinfo");
	}

	if (/\/rank(\?\S+)?$/.test(location.href)) {
		hlTab("ranking");
	} else if (/\/(\?\S+)?$/.test(location.href)) {
		hlTab("timeline");
	} else if (/\/user$/.test(location.href)) {
		hlTab("userinfo");
	} else if (/\/submit$/.test(location.href)) {
		hlTab("submit");
	} else if (/\/user\/\S+$/.test(location.href)) {
		_extra(location.href.match(/\/user\/(\S+)$/)[1]);
	} else if (/\/leaders$/.test(location.href)) {
		_extra("用户排名");
	} else if (/\/comments\/\S+$/.test(location.href)) {
		_extra(location.href.match(/\/comments\/(\S+?)(\?.+)?$/)[1] + " 的回复");
	} else if (/\/submissions\/\S+$/.test(location.href)) {
		_extra(location.href.match(/\/submissions\/(\S+?)(\?.+)?$/)[1] + " 的主题");
	} else if (/\/favorites\/\S+$/.test(location.href)) {
		_extra(location.href.match(/\/favorites\/(\S+?)(\?.+)?$/)[1] + " 的收藏");
	}

	if (/\?password-changed$/.test(location.href)) {
		getid("password-changed").innerHTML = "密码已更改";
	} else if (/\?password-reseted$/.test(location.href)) {
		getid("password-reseted").innerHTML = "密码重置请求已进入队列排队";
	}

	var hiddens = purgeStorage("hidden_posts");
	var foldeds = purgeStorage("folded_posts");

	var items = document.querySelectorAll(".item");
	var limit = window.__AutoHidePt === undefined ? -10 : window.__AutoHidePt;

	for (var i = 0; i < items.length; i++) {
		var item = items[i];
		var pt = parseInt(item.querySelector("span[points]").innerHTML);
		var id = item.id.substr(5);

		if (hiddens[id] || pt <= limit) {
			hide(id, true);
		}

		if (foldeds[id]) {
			fold(id);
		}

		if (item.childNodes.length == 2) {
			display(item.querySelector(".folder"), "none");
		}
	}

	window.ayeItems = window.ayeItems || [];
	window.noItems = window.noItems || [];

	for (var i = 0; i < (window.ayeItems).length; i++) {
		var id = ayeItems[i].split("#")[1];
		getid("item-" + id).querySelector("div[upvote]").className = "vote";
	}

	for (var i = 0; i < (window.noItems).length; i++) {
		var id = noItems[i].split("#")[1];
		getid("item-" + id).querySelector("div[downvote]").className = "vote";
	}

	var parts = document.title.split(" ");
	for (var i = 0; i < parts.length; i++) {
		if (parts[i] == "<a") {
			document.title = parts.splice(0, i).join(' ') + " | " + window.__siteTitle;
			break;
		}
	}

	var favs = document.querySelectorAll(".fave");
	for (var i = 0; i < favs.length; i++) {
		if (window.__userFavorites[favs[i].getAttribute("fave-id")]) {
			favs[i].innerHTML = "取消收藏";
		}
	}
}