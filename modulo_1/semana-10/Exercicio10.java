import java.util.Scanner;
import java.util.Random;

class Exercicio10 {

    public static void main(String... args) {

	Random random = new Random();
	Scanner scanner = new Scanner(System.in);

	System.out.printf("Adivinhe qual número de 1 a 5 eu estou pensando!%n");

	int answer = random.nextInt(5) + 1;
	int guess = scanner.nextInt();

	if (guess == answer) {
	    System.out.printf("Você acertou!");
	} else {
	    System.out.printf("Você errou, o número correto era %d", answer);
	};
    }
    
}
