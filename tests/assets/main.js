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

	var tmls = document.querySelectorAll("div.tml");
	for (var i = 0; i < tmls.length; i++) {
		tmls[i].style.display = "none";

		var toggle = (function(tml) {
			var expand = "+ 展开全文 +";
			var collapse = "- 收起全文 -";
			var toggle = document.createElement("div");
			toggle.className = "tml-toggle";
			toggle.innerHTML = expand;
			toggle.onclick = function() {
				window.location.href = "#" + tml.parentNode.parentNode.id;
				if (toggle.innerHTML === expand) {
					tml.style.display = "block";
					toggle.innerHTML = collapse;
					toggle.style.background = "#667396";
				} else {
					tml.style.display = "none";
					toggle.innerHTML = expand;
					toggle.style.background = "#966666";
				}
			}

			return toggle;
		})(tmls[i]);

		tmls[i].parentNode.appendChild(toggle);
	}

	if (/\#thread\-(\d+)$/.test(location.href)) {
		document.getElementById('comment').value = 
			">>No." + location.href.match(/\#thread\-(\d+)$/)[1] + "\n";
	}
}