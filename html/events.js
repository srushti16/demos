function clicked() {
  alert("clicked");
}

function hovered() {
  console.log("hovered");
}

function increment(amount) {
  let counter = document.getElementById('counter');
  counter.innerText = Number(counter.innerText) + amount;
}

// add event listener for the increment 5 option
document.getElementById('increment5')
  .addEventListener('click', () => {
    increment(5);
  });

