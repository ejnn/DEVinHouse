import java.lang.Math;

class ContaBancaria {

    public static final double LIMITE = 2000;


    private String nomeDoTitular;
    private int numero;
    private int agencia;
    private double saldo;
    private String dataDeAbertura;


    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
	this.saldo = saldo;
    }


    public void sacar(double valor) {

	double novoSaldo = this.saldo - Math.min(LIMITE, valor);

	if (novoSaldo < 0) {
	    this.saldo = 0;
	    return;
	}

	this.saldo = novoSaldo;
    }

    public void depositar(double valor) {
	this.saldo += valor;
    }

    public double verificaSaldo() {
	return this.saldo;
    }

}

class TestaConta {

    public static void main(String... args) {
	testeSaque();
	testeDeposito();
	testeLimite();
    }

    private static void testeSaque() {

	ContaBancaria conta = new ContaBancaria();

	conta.depositar(100);
	conta.sacar(conta.verificaSaldo());

	boolean sucesso = conta.verificaSaldo() == 0;
	System.out.printf("[%s] saque funcional%n", sucesso ? "SUCCESS" : "FAILURE");
    }

    private static void testeDeposito() {

	ContaBancaria conta = new ContaBancaria();

	double saldoAntigo = conta.verificaSaldo();
	double DEPOSITO = 100;
	conta.depositar(DEPOSITO);

	boolean sucesso = conta.verificaSaldo() == (saldoAntigo + DEPOSITO);
	System.out.printf("[%s] deposito funcional%n", sucesso ? "SUCCESS" : "FAILURE");
    }

    private static void testeLimite() {

	ContaBancaria conta = new ContaBancaria(ContaBancaria.LIMITE * 2);

	conta.sacar(ContaBancaria.LIMITE + 1);

	boolean sucesso = conta.verificaSaldo() == ContaBancaria.LIMITE;
	System.out.printf("[%s] limite de saque%n", sucesso ? "SUCCESS" : "FAILURE");
    }

}
