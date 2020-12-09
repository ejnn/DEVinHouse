const resposta = (primeiro, segundo, terceiro, ...resto) => {
  console.log("O livro mais vendido: " + primeiro);
  console.log("2⁰ livro mais vendido: " + segundo);
  console.log("3⁰ livro mais vendido: " + terceiro);
  console.log("Os outros livros: " + resto);
};
