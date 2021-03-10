class Funcionario {
    String nome;
    String sobrenome;
    double salario;

    private static double salarioRestringido(double salario) {

	if (salario > 0) {
	    return salario;
	}

	return 0;
    }

    Funcionario(String nome, String sobrenome, double salario) {
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.salario = salarioRestringido(salario);
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

    public void setSalario(double salario) {
	this.salario = salarioRestringido(salario);
    }

    public double getSalario() {
	return this.salario;
    }
}

class TestaFuncionario {

    public static void main(String... args) {
	testeRestricaoSalario();
	testeAumentoSalarial();
    }

    private static void testeRestricaoSalario() {

	Funcionario cobaia = new Funcionario("", "", -100);

	boolean success = cobaia.getSalario() == 0;
	System.out.printf("[%s] salario negativo não é inicializado%n", success ? "SUCCESS" : "FAILURE");
    }

    private static void testeAumentoSalarial() {

	final double SALARIO = 100;
	Funcionario a = new Funcionario("A", "", SALARIO);
	Funcionario b = new Funcionario("B", "", SALARIO);

	System.out.printf("%s recebe %f%n%s recebe %f%n",
			  a.getNome(),
			  a.getSalario(),
			  b.getNome(),
			  b.getSalario());

	a.setSalario(a.getSalario()*1.1);
	b.setSalario(b.getSalario()*1.1);

	System.out.printf("após um aumento, %s recebe %f%napós um aumento, %s recebe %f%n",
			  a.getNome(),
			  a.getSalario(),
			  b.getNome(),
			  b.getSalario());
    }
}
