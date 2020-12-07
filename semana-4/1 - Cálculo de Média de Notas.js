const resposta = (notas) =>
  console.log(notas.reduce((acc, cur) => acc + cur, 0) / notas.length);
