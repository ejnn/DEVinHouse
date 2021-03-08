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
