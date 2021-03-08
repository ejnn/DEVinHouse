const updateTime = () => {
  var currentDate = new Date();
  document.getElementById("clock").innerHTML =
    "Horário atual: " + currentDate.getHours() + ":" + currentDate.getMinutes();
  setTimeout(updateTime, (60 - currentDate.getSeconds()) * 1000);
};

updateTime();
