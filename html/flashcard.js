function toggle(id) {
  // the plain way
  document.querySelectorAll(`#flashcard-${id} .card-body .card-text`)[0]
    .classList.toggle('hidden');

  // the fun way
  // let card = document.getElementById(`flashcard-${id}`);
  // let answer = document.querySelectorAll(`#flashcard-${id} .card-body .card-text`)[0];
  // let isHidden = answer.getAttribute('class').split(' ') // get all classes
  //   .filter((ele) => ele === 'hidden') // filter out any class that isn't hidden
  //   .length > 0; // check if the resulting array has any elements left


  // if(isHidden) {
  //   let classes = answer.getAttribute('class').split(' ') // get all classes
  //     .filter((ele) => ele !== 'hidden') // keep all classes not hidden
  //     .join(' '); // create one string of all classes separated by a space
  //     answer.setAttribute('class', classes); // reasign the classes to the element

  // } else {
  //   answer.setAttribute('class', `${answer.getAttribute('class')} hidden`);
  // }
}


function addCard() {
  const id = getNewId();
  const question = getNewQuestion();
  const answer = getNewAnswer();
  // get the card container
  const container = document.getElementById('card-container');
  
  // create the card element
  const newCard = document.createElement('div');
  newCard.setAttribute('id', `flashcard-${id}`);
  newCard.classList.add('card');

  // create and append the header for the flashcard
  const header = document.createElement('div');
  header.classList.add('card-header');
  header.innerText = question;
  newCard.appendChild(header);

  // create and append the body for the flashcard
  const body = document.createElement('div');
  body.classList.add('card-body');
  const answerElement = document.createElement('p');
  answerElement.classList.add('card-text');
  answerElement.classList.add('hidden');
  answerElement.innerText = answer;
  const toggleButton = document.createElement('button');
  toggleButton.classList.add('btn');
  toggleButton.classList.add('btn-primary');
  toggleButton.setAttribute('onclick', `toggle(${id})`);
  toggleButton.innerText = 'Toggle Answer';
  body.appendChild(answerElement);
  body.appendChild(toggleButton);
  newCard.appendChild(body);
  
  // append the inner html portion for the element
  // this would allow html injection
//   newCard.innerHTML = `
//   <div class="card-header">
//     ${question}
//   </div>
//   <div class="card-body">
//     <p class="card-text hidden">${answer}</p>
//     <button class="btn btn-primary" onclick="toggle(${id})">Toggle Answer</button>
//   </div>
// `;

  // append the card to the container
  container.appendChild(newCard);
}

function getNewId() {
  return Number(document.getElementById('new-id').value);
}

function getNewQuestion() {
  return document.getElementById('new-question').value;
}

function getNewAnswer() {
  return document.getElementById('new-answer').value;
}

