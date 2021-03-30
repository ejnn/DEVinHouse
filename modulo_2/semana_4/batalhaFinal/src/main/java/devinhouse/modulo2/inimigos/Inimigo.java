package devinhouse.modulo2.inimigos;

import devinhouse.modulo2.Personagem;
import devinhouse.modulo2.Atacante;

import devinhouse.modulo2.enums.Arma;

public abstract class Inimigo extends Personagem implements Atacante {

    private Arma arma;

    public Inimigo() {
	this.arma = Arma.ARMADILHA;
	this.setAtaque(5);
    }

    public void setArma(Arma arma) {
	this.arma = arma;
    }

    public Arma getArma() {
	return this.arma;
    }
}

