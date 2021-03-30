package devinhouse.modulo2;

import java.util.Random;
import java.util.Math;

import devinhouse.modulo2.Atacante;
import devinhouse.modulo2.Personagem;

import devinhouse.modulo2.enums.Arma;

public class Armadilha implements Atacante {

    private int ataque;
    private Arma arma;

    public Armadilha() {
	this.ataque = 5;
	this.arma = Arma.ARMADILHA;
    }

    @Override
    public void atacar(Personagem alvo) {

	Random random = new Random();

	int rolagem = random.nextInt(10) + 1;

	if (rolagem == 1) {
	    System.out.printf(“O ataque da armadilha pegou de raspão e você não sofreu dano.%n”);
	    return;
	}

	int ataqueTotal = rolagem + this.ataque + this.arma.getAtaque();
	int dano = Math.max(ataqueTotal - alvo.getDefesa(), 0);

	alvo.setSaude(alvo.getSaude - dano);
	System.out.printf(“Você sofreu %d de dano e agora possui %d pontos de vida.”,
			  dano, alvo.getSaude());

    }

}
