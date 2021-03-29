package devinhouse.modulo2.classes;

import java.util.Arrays;

import devinhouse.modulo2.Jogador;
import devinhouse.modulo2.enums.Arma;
import devinhouse.modulo2.enums.Sexo;
import devinhouse.modulo2.enums.Motivacao;

public class Guerreiro extends Jogador {

    private Arma[] armasValidas = {
	Arma.ESPADA,
	Arma.MACHADO
    };

    private void validateArma(Arma arma) {
	if (!Arrays.asList(armasValidas).contains(arma)) throw new RuntimeException("arma inválida para um guerreiro!");
    }

    public Guerreiro(String nome, Sexo sexo, Motivacao motivacao, Arma arma) {
	super(15, 15, nome, sexo, motivacao, arma);
	validateArma(arma);
    }
}
