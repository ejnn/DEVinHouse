var nome = window.prompt("Olá! Qual o seu nome?");
console.log("nome: " + nome);

var idade = window.prompt("Quantos anos você tem?");
console.log("idade: " + idade);

// prettier-ignore
var praticaEsportes = window.confirm("CPF e número do cartão? (brincadeira) \n"
                                     + "Você gosta de praticar algum esporte?");
console.log("gosta de praticar esportes: " + praticaEsportes.toString());
