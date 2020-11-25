var currentMonth = new Date().getMonth();

var seasonTitle = document.getElementById("seasonTitle");
var seasonImage = document.getElementById("seasonImage");

if (currentMonth == 11 || (0 <= currentMonth && currentMonth <= 1)) {
  seasonTitle.innerHTML = "Verão";
  seasonImage.src = "verao.jpg";
  seasonImage.alt = "Uma bela paisagem de verão";
} else if (2 <= currentMonth && currentMonth <= 4) {
  seasonTitle.innerHTML = "Outono";
  seasonImage.src = "outono.jpg";
  seasonImage.alt = "Uma bela paisagem de outono";
} else if (5 <= currentMonth && currentMonth <= 7) {
  seasonTitle.innerHTML = "Inverno";
  seasonImage.src = "inverno.jpg";
  seasonImage.alt = "Uma bela paisagem de inverno";
} else if (8 <= currentMonth && currentMonth <= 10) {
  seasonTitle.innerHTML = "Primavera";
  seasonImage.src = "primavera.jpg";
  seasonImage.alt = "Uma bela paisagem de primavera";
}
