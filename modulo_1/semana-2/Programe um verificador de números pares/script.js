const handleNumberChange = (event) => {
  var number = event.target.value;
  var numberDescription = document.getElementById("numberDescription");
  if (number % 2) {
    numberDescription.innerHTML = "Esse número é ímpar!";
  } else {
    numberDescription.innerHTML = "Esse número é par!";
  }
};

document
  .getElementById("number")
  .addEventListener("change", handleNumberChange);
