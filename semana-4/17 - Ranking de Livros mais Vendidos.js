const bubbleUp = (array) => {
  const biggest = { value: Number.NEGATIVE_INFINITY, index: -1 };

  array.forEach((value, index) => {
    if (value > biggest.value) {
      biggest.value = value;
      biggest.index = index;
    }
  });

  array.splice(biggest.index, 1);
  array.splice(0, 0, biggest.value);
};

const resposta = (array) => {
  var array = array.slice();

  for (let i = 1; i <= 3; i++) {
    bubbleUp(array);
  }
  console.log(array);
};
