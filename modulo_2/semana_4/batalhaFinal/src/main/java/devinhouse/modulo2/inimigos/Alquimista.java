package devinhouse.modulo2.inimigos;

import devinhouse.modulo2.inimigos.Inimigo;
import devinhouse.modulo2.enums.Arma;

public class Alquimista extends Inimigo {

    final static int SAUDE_MAXIMA = 100;

    public Alquimista() {
	super();

	this.setSaude(Alquimista.SAUDE_MAXIMA);
	this.setAtaque(15);
	this.setDefesa(10);
	this.setArma(Arma.CAJADO);
    }
}
