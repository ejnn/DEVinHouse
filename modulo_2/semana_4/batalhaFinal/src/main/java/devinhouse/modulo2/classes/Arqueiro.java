package devinhouse.modulo2.classes;

import java.util.Arrays;

import devinhouse.modulo2.Jogador;
import devinhouse.modulo2.enums.Arma;
import devinhouse.modulo2.enums.Sexo;
import devinhouse.modulo2.enums.Motivacao;

public class Arqueiro extends Jogador {

    private static Arma[] armasDisponiveis = {
	Arma.ARCO,
	Arma.BESTA
    };

    private static void validateArma(Arma arma) {
	if (!Arrays.asList(armasDisponiveis).contains(arma)) throw new RuntimeException("arma indisponível para um arqueiro!");
    }

    public static Arma[] getArmasDisponiveis() {
	return armasDisponiveis;
    }

    public Arqueiro(String nome, Sexo sexo, Motivacao motivacao, Arma arma) {
	super(18, 13, nome, sexo, motivacao, arma);
	Arqueiro.validateArma(arma);
    }
}
