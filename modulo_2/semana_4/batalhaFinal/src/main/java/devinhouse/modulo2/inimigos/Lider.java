package devinhouse.modulo2.inimigos;

import devinhouse.modulo2.inimigos.Inimigo;
import devinhouse.modulo2.enums.Arma;

public class Lider extends Inimigo {

    final static int SAUDE_MAXIMA = 200;

    public Lider() {
	super();

	this.setSaude(Lider.SAUDE_MAXIMA);
	this.setAtaque(15);
	this.setDefesa(15);
	this.setArma(Arma.CAJADO);
    }
}
