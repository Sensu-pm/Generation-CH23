//Declaración de variables
var eleccion =55;
var intentos = document.querySelector('.intentos');
var lastResult = document.querySelector('.lastResult');
var guessSubmit = document.querySelector('.guessSubmit');
var guessField = document.querySelector('.guessField');
var guessCount = 1;
var resetButton;

//Incialización de la función
function comparacion() {
  var userGuess = Number(guessField.value);
  if (guessCount === 1) {
    intentos.textContent = 'Intentos anteriores: ';
  }

  intentos.textContent += userGuess + ', ';

  if (userGuess === eleccion) {
    lastResult.textContent = '¡Felicidades! ¡Lo adivinaste!';
    lastResult.style.backgroundColor = 'green';
    setGameOver();
  } else if (guessCount === 10) {
    lastResult.textContent = '¡¡¡GAME OVER!!!';
    
    setGameOver();
  } else {
    lastResult.textContent = '¡Equivocado!';
    lastResult.style.backgroundColor = 'red';
  }

  guessCount++;
  guessField.value = '';
}

guessSubmit.addEventListener('click', comparacion);

function setGameOver() {
  guessField.disabled = true;
  guessSubmit.disabled = true;
  resetButton = document.createElement('button');
  resetButton.textContent = 'Quieres intentarlo otra vez?';
  resetButton.style.cursor = 'pointer';
  document.body.appendChild(resetButton);
  resetButton.addEventListener('click', resetGame);
}

function resetGame() {
  guessCount = 1;
  var resetParas = document.querySelectorAll('.resultParas p');
  for(var i = 0; i < resetParas.length; i++) {
    resetParas[i].textContent = '';
  }

  resetButton.parentNode.removeChild(resetButton);
  guessField.disabled = false;
  guessSubmit.disabled = false;
  guessField.value = '';
  guessField.focus();
  lastResult.style.backgroundColor = 'white';
 
}