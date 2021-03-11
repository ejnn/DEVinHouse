class Retangulo {

    private double comprimento = 1;
    private double largura = 1;

    public void setComprimento(double comprimento) {

	if (0 < comprimento && comprimento < 20) {
	    this.comprimento = comprimento;
	}
    }

    public double getComprimento() {
	return this.comprimento;
    }

    public void setLargura(double largura) {

	if (0 < largura && largura < 20) {
	    this.largura = largura;
	}
    }

    public double getLargura() {
	return this.largura;
    }

    public double getPerimetro() {
	return 2 * this.largura + 2 * this.comprimento;
    }

    public double getArea() {
	return this.largura * this.comprimento;
    }
}


class TesteRetangulo {

    public static void main(String... args) {
	testeRestricaoLargura();
	testeArea();
	testePerimetro();
    }

    private static void testeRestricaoLargura() {

	Retangulo quadrado = new Retangulo();

	final double LARGURA_NEGATIVA = -2;
	quadrado.setLargura(LARGURA_NEGATIVA);

	final double LARGURA_EXCESSIVA = 21;
	quadrado.setLargura(LARGURA_EXCESSIVA);

	double largura = quadrado.getLargura();
	boolean success = 0 < largura && largura < 20;
	System.out.printf("[%s] largura obedece restrições%n", success ? "SUCCESS" : "FAILURE");
    }

    private static void testeArea() {

	Retangulo quadrado = new Retangulo();

	final double LADO = 2;
	quadrado.setLargura(LADO);
	quadrado.setComprimento(LADO);

	boolean success = quadrado.getArea() == 4;
	System.out.printf("[%s] area funcional%n", success ? "SUCCESS" : "FAILURE");
    }

    private static void testePerimetro() {

	Retangulo quadrado = new Retangulo();

	final double LADO = 2;
	quadrado.setLargura(LADO);
	quadrado.setComprimento(LADO);

	boolean success = quadrado.getPerimetro() == 8;
	System.out.printf("[%s] perimetro funcional%n", success ? "SUCCESS" : "FAILURE");
    }
}
