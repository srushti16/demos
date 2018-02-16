function getJoke(category) {
  let url;
  if(category) {
    url = 'http://api.icndb.com/jokes/random?limitTo=[nerdy]';
  } else {
    url = 'http://api.icndb.com/jokes/random';
  }
  let joke;
  let xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if(xhttp.readyState === 4) { // 4 says response is ready
      if(xhttp.status === 200 ) { // 200 says response was a success
        console.log(xhttp.responseText);
        joke = JSON.parse(xhttp.responseText);
        document.getElementById('joke').innerText = joke.value.joke;
      } else {
        console.log('request for joke failed')
      }
    } else {
      // response is not ready yet
    }
  }
  xhttp.open('GET', url);
  xhttp.send(); // for other types, xhttp.send(body);, xhttp.send(JSON.stringify(crediantial))
}


getJoke();