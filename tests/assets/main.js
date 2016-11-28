function ajax(url, callback, data, x) {
    try {
        x = new(this.XMLHttpRequest || ActiveXObject)('MSXML2.XMLHTTP.3.0');
        x.open(data ? 'POST' : 'GET', url, 1);
        x.setRequestHeader('X-Requested-With', 'XMLHttpRequest');
        x.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
        x.onreadystatechange = function () {
            x.readyState > 3 && callback && callback(x.responseText, x);
        };
        x.send(data)
    } catch (e) {
        window.console && console.log(e);
    }
}

function isElementInViewport (el) {
    //special bonus for those using jQuery
    if (typeof jQuery === "function" && el instanceof jQuery) {
        el = el[0];
    }

    var rect = el.getBoundingClientRect();

    return (
        rect.top >= 0 &&
        rect.left >= 0 &&
        rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) && /*or $(window).height() */
        rect.right <= (window.innerWidth || document.documentElement.clientWidth) /*or $(window).width() */
    );
}

function fd(ts) {
    var d = new Date(parseInt(ts));
    var pad = function(num) {
        return num < 10 ? ("0" + num) : num;
    };

    return d.getFullYear() + "/" + pad(d.getMonth() + 1) + "/" + pad(d.getDate()) + " " + 
        pad(d.getHours()) + ":" + pad(d.getMinutes()) + ":" + pad(d.getSeconds());
}

function fd2(ts) {
    var diff = (new Date().getTime() - ts) / 1000;
    if (diff < 3600) {
        return parseInt(diff / 60) + " 分钟前";
    } else if (diff < 86400) {
        return parseInt(diff / 3600) + " 小时前";
    } else {
        return parseInt(diff / 86400) + " 天前";
    }
}

function floating(id) {
    var panel = document.getElementById('reply');
    var thread = document.getElementById('thread-' + id);
    var rect = thread.getBoundingClientRect();
    var width = window.innerWidth
        || document.documentElement.clientWidth
        || document.body.clientWidth;

    panel.querySelector("textarea").value += ">>No." + id + "\n";

    if (!isElementInViewport(panel)) {
        panel.className += " floating";
        var h = panel.querySelector("a[hide]");
        h.style.display = "block";
        h.onclick = function(e) {
            panel.className = panel.className.replace(" floating", "");
            h.style.display = "none";
        }
    }
}

function open(id) {
    location.href = "/thread/" + id;
}

function openref(id, a) {
    var rect = a.getBoundingClientRect();

    ajax("/api/" + id, function(html) {
        var div = document.createElement("div");
        div.className = "thread reply reft";
        div.id = "ref-div-" + id;
        div.innerHTML = html;
        var d = div.querySelector(".date");
        if (d) d.innerHTML = fd(d.innerHTML);

        div.style.position = "fixed";
        div.style.left = rect.left + "px";
        div.style.top = (rect.top - 10) + "px";
        document.getElementsByTagName('body')[0].appendChild(div);
    });
}

function closeref(id) {
    var refs = document.querySelectorAll("div.reft");
    for (var i = 0; i <refs.length; i++) {
        refs[i].parentNode.removeChild(refs[i]);
    }
}

function hide(id, noupdate) {
    var main = document.getElementById('thread-' + id);
    var hider = main.querySelector(".hider");
    var hiddens = noupdate ? {} : JSON.parse(localStorage.getItem("hidden_threads") || "{}");

    if (hider.innerHTML == '-') {
        main.querySelector(".tail").style.display = "none";
        main.querySelector(".bar").className += " opacity50";
        hider.innerHTML = "+";
        hiddens[id] = new Date().getTime();
    } else {
        main.querySelector(".tail").style.display = "block";
        main.querySelector(".bar").className = "bar";
        hider.innerHTML = "-";
        delete hiddens[id];
    }

    if (noupdate) {

    } else {
        localStorage.setItem("hidden_threads", JSON.stringify(hiddens));
    }
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
    var dates = document.querySelectorAll("span.date");
    for (var i = 0; i < dates.length; i++) {
        dates[i].setAttribute("title", fd2(dates[i].innerHTML));
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
                window.location.href = "#" + tml.parentNode.parentNode.parentNode.id;
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
        document.getElementById('comment').value = ">>No." + location.href.match(/\#thread\-(\d+)$/)[1] + "\n";
    }

    (document.getElementById("emoji") || {}).onchange = function(e) {
        document.getElementById('comment').value += this.value;
        document.getElementById('comment').focus();
    }

    var hiddens = purgeStorage("hidden_threads");
    var threads = document.querySelectorAll(".thread");

    for (var i = 0; i < threads.length; i++) {
        var thread = threads[i];
        var id = thread.id.substr(7);

        if (hiddens[id]) {
            hide(id, true);
        }
    }
}