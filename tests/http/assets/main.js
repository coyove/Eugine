function hlTab(id) {
	var e = document.getElementById(id)
	e.style.color = "black";
	e.style.backgroundColor = "#f0ebe4";
	e.style.marginTop = "-2px";
	e.style.paddingTop = "2px";
}

window.onload = function() {
	if (/\/rank(\?\S+)?$/.test(location.href)) {
		hlTab("ranking");
	} else if (/\/(\?\S+)?$/.test(location.href)) {
		hlTab("timeline");
	} else if (/\/user?$/.test(location.href)) {
		hlTab("userinfo");
	} else if (/\/submit?$/.test(location.href)) {
		hlTab("submit");
	}
}