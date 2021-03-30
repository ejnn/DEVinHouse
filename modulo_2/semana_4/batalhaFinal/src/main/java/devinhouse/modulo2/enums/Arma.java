package devinhouse.modulo2.enums;

public enum Arma {
    ESPADA (10),
    MACHADO (10),
    MARTELO (10),
    CLAVA (10),
    ARCO (10),
    BESTA (10),
    CAJADO (10),
    LIVRO_DE_MAGIAS (10),
    ARMADILHA (10),
    MACHADO_DUPLO (10);

    private int ataque;

    private Arma(int ataque) {
	this.ataque = ataque;
    }

    public int getAtaque() {
	return this.ataque;
    }
    
}
