const submitProgression = (event) => {
  event.preventDefault();

  var formData = new FormData(event.target);

  var initialValue = parseInt(formData.get("initialValue"), 10);
  var root = parseInt(formData.get("root"), 10);

  var operate;
  switch (event.submitter.value) {
    case "Calcular P.A.":
      operate = (x) => x + root;
      break;
    case "Calcular P.G.":
      operate = (x) => x * root;
      break;
  }

  var progression = document.getElementById("progression");
  progression.innerHTML = "";

  var term = initialValue;
  for (let i = 1; i <= 10; i++) {
    let newTerm = document.createElement("li");
    newTerm.append(term);
    progression.appendChild(newTerm);

    term = operate(term);
  }
};

document
  .getElementById("progressionForm")
  .addEventListener("submit", submitProgression);
