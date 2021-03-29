package devinhouse.modulo2;

public abstract class Personagem {
    private int saude;
    private int ataque;
    private int defesa;

    public Personagem(int saude, int ataque, int defesa) {
	this.saude = saude;
	this.ataque = ataque;
	this.defesa = defesa;
    }

    public void setSaude(int saude) {
	this.saude = saude;
    }

    public int getSaude() {
	return this.saude;
    }

    public void setAtaque(int ataque) {
	this.ataque = ataque;
    }

    public int getAtaque() {
	return this.ataque;
    }

    public void setDefesa(int defesa) {
	this.defesa = defesa;
    }

    public int getDefesa() {
	return this.defesa;
    }

}
