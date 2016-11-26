function fd(ts) {
	var d = new Date(parseInt(ts));
	var pad = function(num) {
		return num < 10 ? ("0" + num) : num;
	};

	return d.getFullYear() + "/" + pad(d.getMonth() + 1) + "/" + pad(d.getDate()) + " " + 
		pad(d.getHours()) + ":" + pad(d.getMinutes()) + ":" + pad(d.getSeconds());
}

window.onload = function() {
	var dates = document.querySelectorAll("span.date");
	for (var i in dates) {
		dates[i].innerHTML = fd(dates[i].innerHTML);
	}
}