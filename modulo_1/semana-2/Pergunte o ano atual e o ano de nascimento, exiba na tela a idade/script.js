var birthYear = parseInt(window.prompt("Olá! Em que ano você nasceu?"), 10);

var currentYear = parseInt(
  window.prompt("Umm... em que ano estamos mesmo?"),
  10
);

var usersAge = currentYear - birthYear;

window.alert(
  "Então sua idade é " + usersAge + " ou " + (usersAge - 1) + ", certo?"
);
