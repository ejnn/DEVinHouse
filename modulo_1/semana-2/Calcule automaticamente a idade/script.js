const submitAge = (event) => {
  event.preventDefault();
  var formData = new FormData(event.target);

  var birthDate = new Date(formData.get("birthDate"));
  var currentDate = new Date();

  var birthYear = birthDate.getFullYear();
  var birthMonth = birthDate.getMonth();
  var birthDay = birthDate.getDate();

  var currentYear = currentDate.getFullYear();
  var currentMonth = currentDate.getMonth();
  var currentDay = currentDate.getDate();

  var age = currentYear - birthYear;
  if (
    currentMonth < birthMonth ||
    (currentMonth == birthMonth && currentDay < birthDay)
  ) {
    age += -1;
  }

  document.getElementById("ageDescription").innerHTML =
    "Você tem " + age + " anos :)";
};

document.getElementById("ageForm").addEventListener("submit", submitAge);
