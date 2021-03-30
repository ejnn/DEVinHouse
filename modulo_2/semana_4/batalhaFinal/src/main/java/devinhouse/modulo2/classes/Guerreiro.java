package devinhouse.modulo2.classes;

import java.util.Arrays;

import devinhouse.modulo2.Jogador;
import devinhouse.modulo2.enums.Arma;
import devinhouse.modulo2.enums.Sexo;
import devinhouse.modulo2.enums.Motivacao;

public class Guerreiro extends Jogador {

    private static Arma[] armasDisponiveis = {
	Arma.ESPADA,
	Arma.MACHADO
    };

    private static void validateArma(Arma arma) {
	if (!Arrays.asList(armasDisponiveis).contains(arma)) throw new RuntimeException("arma indisponível para um guerreiro!");
    }

    public static Arma[] getArmasDisponiveis() {
	return armasDisponiveis;
    }

    public Guerreiro(String nome, Sexo sexo, Motivacao motivacao, Arma arma) {
	super(15, 15, nome, sexo, motivacao, arma);
	Guerreiro.validateArma(arma);
    }
}
