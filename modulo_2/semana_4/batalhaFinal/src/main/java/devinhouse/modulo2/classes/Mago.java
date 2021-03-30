package devinhouse.modulo2.classes;

import java.util.Arrays;

import devinhouse.modulo2.Jogador;
import devinhouse.modulo2.enums.Arma;
import devinhouse.modulo2.enums.Sexo;
import devinhouse.modulo2.enums.Motivacao;

public class Mago extends Jogador {

    private static Arma[] armasDisponiveis = {
	Arma.CAJADO,
	Arma.LIVRO_DE_MAGIAS
    };

    private static void validateArma(Arma arma) {
	if (!Arrays.asList(armasDisponiveis).contains(arma)) throw new RuntimeException("arma indisponível para um mago!");
    }

    public static Arma[] getArmasDisponiveis() {
	return armasDisponiveis;
    }

    public Mago(String nome, Sexo sexo, Motivacao motivacao, Arma arma) {
	super(19, 11, nome, sexo, motivacao, arma);
	Mago.validateArma(arma);
    }
}
