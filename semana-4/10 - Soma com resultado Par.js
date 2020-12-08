const resposta = (num1, num2) =>
  new Promise((resolve, reject) => {
    var soma = num1 + num2;
    soma % 2
      ? reject("O numero não era par; rejeito números ímpares")
      : resolve(soma);
  });
