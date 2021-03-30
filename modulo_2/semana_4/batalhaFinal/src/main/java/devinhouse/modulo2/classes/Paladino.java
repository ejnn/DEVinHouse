package devinhouse.modulo2.classes;

import java.util.Arrays;

import devinhouse.modulo2.Jogador;
import devinhouse.modulo2.enums.Arma;
import devinhouse.modulo2.enums.Sexo;
import devinhouse.modulo2.enums.Motivacao;

public class Paladino extends Jogador {

    private static Arma[] armasDisponiveis = {
	Arma.MARTELO,
	Arma.CLAVA
    };

    private static void validateArma(Arma arma) {
	if (!Arrays.asList(armasDisponiveis).contains(arma)) throw new RuntimeException("arma indisponível para um paladino!");
    }

    public static Arma[] getArmasDisponiveis() {
	return armasDisponiveis;
    }

    public Paladino(String nome, Sexo sexo, Motivacao motivacao, Arma arma) {
	super(13, 18, nome, sexo, motivacao, arma);
	Paladino.validateArma(arma);
    }
}
