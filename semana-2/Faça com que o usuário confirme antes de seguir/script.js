const confirmarRedirect = (event) => {
  if (window.confirm("Uma nova aba será aberta, ok?")) {
    window.open("https://github.com/ejnn/devinhouse/commits/master/semana-2");
  }
};

document
  .getElementById("commitsButton")
  .addEventListener("click", confirmarRedirect);
