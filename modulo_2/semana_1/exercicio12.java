import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class FrequenciaCardiaca {

    private String nome;
    private String sobrenome;
    private String dataDeNascimento;

    FrequenciaCardiaca(String nome, String sobrenome, String dataDeNascimento) {
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.dataDeNascimento = dataDeNascimento;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getNome() {
	return this.nome;
    }

    public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
	return this.sobrenome;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
	this.dataDeNascimento = dataDeNascimento;
    }

    public String getDataDeNascimento() {
	return this.dataDeNascimento;
    }

    public int getIdade() {

	LocalDate hoje = LocalDate.now();
	LocalDate dataDeNascimento = LocalDate.parse(this.dataDeNascimento,
						     DateTimeFormatter.ofPattern("dd/MM/yyy"));

	return Period.between(dataDeNascimento, hoje).getYears();
    }

    public int getFrequenciaMaxima() {
	return 220 - this.getIdade();
    }

    public int[] getLimitesFrequenciaAlvo() {

	int[] limitesFrequenciaAlvo = {
	    (int)(this.getFrequenciaMaxima() * 0.5),
	    (int)(this.getFrequenciaMaxima() * 0.85)
	};

	return limitesFrequenciaAlvo;
    }

}

class FrequenciaCardiacaApp {

    public static void main(String... args) {

	Scanner input = new Scanner(System.in);

	System.out.printf("Por favor forneça os seguinte dados:%n");

	System.out.printf("Nome: ");
	String nome = input.nextLine();

	System.out.printf("Sobrenome: ");
	String sobrenome = input.nextLine();

	System.out.printf("Data de nascimento: ");
	String dataDeNascimento = input.nextLine();


	FrequenciaCardiaca frequenciaDoUsuario = new FrequenciaCardiaca(nome,
									sobrenome,
									dataDeNascimento);
	System.out.printf("Dados de %s %s:%n"
			  + "Idade: %d%n"
			  + "Frequência cardíaca máxima: %d%n"
			  + "Frequência cardíaca mínima: entre %d e %d%n"
			  + "(frequências segundo a American Heart Association)%n",
			  frequenciaDoUsuario.getNome(),
			  frequenciaDoUsuario.getSobrenome(),
			  frequenciaDoUsuario.getIdade(),
			  frequenciaDoUsuario.getFrequenciaMaxima(),
			  frequenciaDoUsuario.getLimitesFrequenciaAlvo()[0],
			  frequenciaDoUsuario.getLimitesFrequenciaAlvo()[1]);
    }
}
