class Porta {
    String cor;
    double largura;
    double altura;
    double profundidade;
    boolean aberta;

    Porta() {
	this.cor = "vermelho";
	this.largura = 0;
	this.altura = 0;
	this.profundidade = 0;
	this.aberta = true;
    }

    Porta(String cor, double largura, double altura, double profundidade, boolean aberta) {
	this.cor = cor;
	this.largura = largura;
	this.altura = altura;
	this.profundidade = profundidade;
	this.aberta = aberta;
    }

    public void abre() {
	if (!this.aberta) {
	    this.aberta = true;
	}
    }

    public void fecha() {
	if (this.aberta) {
	    this.aberta = false;
	}
    }

    public void pinta(String cor) {
	this.cor = cor;
    }

    public boolean estaAberta() {
	return this.aberta;
    }
}

class TestaPorta {

    public static void main(String... args) {
	testeAbrirEFechar();
    }

    private static void testeAbrirEFechar() {

	Porta porta = new Porta();

	porta.fecha();
	boolean fechou = !porta.estaAberta();

	porta.abre();
	boolean abriu = porta.estaAberta();

	boolean sucesso = fechou && abriu;
	System.out.printf("[%s] fechar e abrir porta%n", sucesso ? "SUCCESS" : "FAILURE");

    }

}
