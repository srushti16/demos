function login() {
	let url = "./login";
	let credentials = {};
	credentials.username = document.getElementById("username").value;
	credentials.password = document.getElementById("password").value;
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState === 4) { // 4 says response is ready
			if (xhttp.status === 200) { // 200 says response was a success
				window.location = "http://localhost:8080/last-day-servlets/home"
			} else {
				alert('invalid credentials')
			}
		} else {
			// response is not ready yet
		}
	}
	xhttp.open('POST', url);
	xhttp.send(JSON.stringify(credentials)); // for other types, xhttp.send(body);,
					// xhttp.send(JSON.stringify(crediantial))

}