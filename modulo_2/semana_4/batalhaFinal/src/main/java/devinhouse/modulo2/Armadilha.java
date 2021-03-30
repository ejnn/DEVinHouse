package devinhouse.modulo2;

import devinhouse.modulo2.Atacante;
import devinhouse.modulo2.enums.Arma;

public class Armadilha implements Atacante {

    private int ataque;
    private Arma arma;

    public Armadilha() {
	this.ataque = 5;
	this.arma = Arma.ARMADILHA;
    }

}
