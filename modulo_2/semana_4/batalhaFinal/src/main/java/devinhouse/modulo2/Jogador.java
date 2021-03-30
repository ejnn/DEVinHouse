package devinhouse.modulo2;

import devinhouse.modulo2.Personagem;
import devinhouse.modulo2.Atacante;
import devinhouse.modulo2.enums.Motivacao;
import devinhouse.modulo2.enums.Arma;
import devinhouse.modulo2.enums.Sexo;

public abstract class Jogador extends Personagem implements Atacante {

    final static int SAUDE_MAXIMA = 200;

    private static void validateNome(String nome) {
	if (nome.isEmpty()) throw new RuntimeException("nome de jogador inválido!");
    }

    private String nome;
    private Sexo sexo;
    private Motivacao motivacao;
    private Arma arma;

    public Jogador(int ataque, int defesa,
		   String nome,
		   Sexo sexo,
		   Motivacao motivacao,
		   Arma arma) {
	super(Jogador.SAUDE_MAXIMA, ataque, defesa);

	Jogador.validateNome(nome);
	this.nome = nome;

	this.sexo = sexo;
	this.motivacao = motivacao;
	this.arma = arma;
    }

    public String getNome() {
	return this.nome;
    }

    public Sexo getSexo() {
	return this.sexo;
    }

    public Motivacao getMotivacao() {
	return this.motivacao;
    }

    public void setArma(Arma arma) {
	this.arma = arma;
    }

    public Arma getArma() {
	return this.arma;
    }

}
