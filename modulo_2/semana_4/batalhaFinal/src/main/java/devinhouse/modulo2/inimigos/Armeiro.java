package devinhouse.modulo2.inimigos;

import devinhouse.modulo2.Inimigo;
import devinhouse.modulo2.enums.Arma;

public class Armeiro extends Inimigo {

    final static int SAUDE_MAXIMA = 100;

    public Armeiro() {
	super();

	this.setSaude(Armeiro.SAUDE_MAXIMA);
	this.setAtaque(10);
	this.setDefesa(15);
	this.setArma(Arma.ESPADA);
    }
}
