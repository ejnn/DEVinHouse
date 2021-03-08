import java.util.Random;

class Exercicio03 {
    public static void main(String... args) {
	Random random = new Random();

	int limiteSuperior = 2;
	int numeroAleatorio = random.nextInt(limiteSuperior);

	System.out.printf(String.valueOf(numeroAleatorio));
    }
}
