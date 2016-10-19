function hlTab(id) {
	var e = document.getElementById(id)
	e.style.color = "#eee";
	e.style.backgroundColor = "#758ca8";
}

function hide(id) {
	var item = document.getElementById("item-" + id);
	var title = item.querySelector(".title");
	var info = item.querySelector(".info");
	var hiddens = JSON.parse(localStorage.getItem("hidden_posts") || "{}");

	var hider = info.querySelector(".hider");
	if (hider.innerHTML == "hide") {
		hider.innerHTML = "un-hide";
		title.style.display = "none";
		hiddens[id] = new Date().getTime();
	} else {
		hider.innerHTML = "hide";
		title.style.display = "block";
		delete hiddens[id];
	}

	localStorage.setItem("hidden_posts", JSON.stringify(hiddens));
}

function del(id) {
	if (confirm("Deletion cannot be restored")) {
		location.href = "/delete/" + id;
	}
}

window.onload = function() {
	if (/\/rank(\?\S+)?$/.test(location.href)) {
		hlTab("ranking");
	} else if (/\/(\?\S+)?$/.test(location.href)) {
		hlTab("timeline");
	} else if (/\/user$/.test(location.href)) {
		hlTab("userinfo");
	} else if (/\/submit$/.test(location.href)) {
		hlTab("submit");
	} else if (/\/user\/\S+$/.test(location.href)) {
		document.getElementById('memberinfo').className = "";
		document.getElementById('memberinfo').innerHTML = 
			location.href.match(/\/user\/(\S+)$/)[1] + "'s profile";
		hlTab("memberinfo");
	}

	var hiddens = JSON.parse(localStorage.getItem("hidden_posts") || "{}");
	var now = new Date().getTime();
	for (var id in hiddens) {
		if (now - hiddens[id] > 86400000 * 7) {
			delete hiddens[id];
		}
	}
	localStorage.setItem("hidden_posts", JSON.stringify(hiddens));

	var items = document.querySelectorAll(".item");
	var limit = window.__AutoHidePt === undefined ? -10 : window.__AutoHidePt;

	for (var i = 0; i < items.length; i++) {
		var pt = parseInt(items[i].querySelector("span[points]").innerHTML);

		if (hiddens[items[i].id.substr(5)] || pt <= limit) {
			items[i].querySelector(".hider").innerHTML = "un-hide";
			items[i].querySelector(".title").style.display = "none";
		}
	}
}