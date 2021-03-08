class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
    }

    public void fazAniversario() {
	this.idade++;
    }
}

class TestaPessoa {

    public static void main(String... args) {
	Pessoa cobaia = new Pessoa("Eduardo", 22);

	System.out.printf("%s tem %d anos.%n", cobaia.nome, cobaia.idade);
	cobaia.fazAniversario();
	System.out.printf("Passado seu aniversário, %s tem agora %d anos%n", cobaia.nome, cobaia.idade);
    }
}
