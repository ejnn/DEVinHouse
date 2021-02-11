import java.util.Scanner;

class Exercicio17 {

    private static int factorial(int n) {
	if (n == 0) {
	    return 1;
	} else {
	    return n * factorial(n-1);
	}
    }

    public static void main(String... args) {

	Scanner input = new Scanner(System.in);

	System.out.printf("Por favor, insira um número de 0 a 10%n");
	int number = input.nextInt();

	int LOWER_LIMIT = 0;
	int UPPER_LIMIT = 10;

	if (LOWER_LIMIT <= number && number <= UPPER_LIMIT) {
	    System.out.printf("%d! = %d%n", number, factorial(number));
	} else {
	    System.out.printf("Esse número não está entre 0 e 10! >:(%n");
	}
    }

}
