var currentDate = new Date();
document.getElementById("accessDescription").innerHTML =
  "Horário de acesso: " +
  currentDate.getHours() +
  ":" +
  currentDate.getMinutes();
