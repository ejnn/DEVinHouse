package devinhouse.modulo2.classes;

import java.util.Arrays;

import devinhouse.modulo2.Jogador;
import devinhouse.modulo2.enums.Arma;
import devinhouse.modulo2.enums.Sexo;
import devinhouse.modulo2.enums.Motivacao;

public class Arqueiro extends Jogador {

    private Arma[] armasValidas = {
	Arma.ARCO,
	Arma.BESTA
    };

    private void validateArma(Arma arma) {
	if (!Arrays.asList(armasValidas).contains(arma)) throw new RuntimeException("arma inválida para um arqueiro!");
    }

    public Arqueiro(String nome, Sexo sexo, Motivacao motivacao, Arma arma) {
	super(18, 13, nome, sexo, motivacao, arma);
	validateArma(arma);
    }
}
