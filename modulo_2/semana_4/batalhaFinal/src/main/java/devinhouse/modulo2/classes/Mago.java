package devinhouse.modulo2.classes;

import java.util.Arrays;

import devinhouse.modulo2.Jogador;
import devinhouse.modulo2.enums.Arma;
import devinhouse.modulo2.enums.Sexo;
import devinhouse.modulo2.enums.Motivacao;

public class Mago extends Jogador {

    private Arma[] armasValidas = {
	Arma.CAJADO,
	Arma.LIVRO_DE_MAGIAS
    };

    private void validateArma(Arma arma) {
	if (!Arrays.asList(armasValidas).contains(arma)) throw new RuntimeException("arma inválida para um mago!");
    }

    public Mago(String nome, Sexo sexo, Motivacao motivacao, Arma arma) {
	super(19, 11, nome, sexo, motivacao, arma);
	validateArma(arma);
    }
}
