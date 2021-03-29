enum Semaforo {
    VERMELHO (10),
    VERDE (20),
    AMARELO (5);

    private int duracao;

    Semaforo(int duracao) {
	this.duracao = duracao;
    }

    public int getDuracao() {
	return this.duracao;
    }

}

public class Exercicio2 {

    public static void main(String... args) {
	for (Semaforo semaforo : Semaforo.values()) {
	    System.out.printf(""
			      + "O semáforo " + semaforo
			      + " dura " + semaforo.getDuracao()
			      + " segundos.%n");
	}
    }
}
