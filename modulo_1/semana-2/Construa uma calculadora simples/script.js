const submitOperation = (event) => {
  event.preventDefault();

  var formData = new FormData(event.target);

  var number1 = parseInt(formData.get("number1"), 10);
  var number2 = parseInt(formData.get("number2"), 10);

  switch (event.submitter.value) {
    case "+":
      document.getElementById("result").value = number1 + number2;
      break;
    case "-":
      document.getElementById("result").value = number1 - number2;
      break;
    case "*":
      document.getElementById("result").value = number1 * number2;
      break;
    case "/":
      document.getElementById("result").value = number1 / number2;
      break;
  }
};

document
  .getElementById("operationForm")
  .addEventListener("submit", submitOperation);
