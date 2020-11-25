const submitNewItem = (event) => {
  event.preventDefault();

  var formData = new FormData(event.target);

  var list = document.getElementById("list");
  var newOption = document.createElement("option");
  newOption.text = formData.get("newItem");
  list.add(newOption);

  event.target.reset();
};

document
  .getElementById("newItemForm")
  .addEventListener("submit", submitNewItem);

const saveList = (event) => {
  window.localStorage.setItem(
    "list",
    document.getElementById("list").innerHTML
  );
};

document.getElementById("saveListButton").addEventListener("click", saveList);
