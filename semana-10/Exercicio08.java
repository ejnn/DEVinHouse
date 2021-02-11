import java.util.Scanner;

class Exercicio08 {

    public static void main(String... args) {

	Scanner scanner = new Scanner(System.in);

	System.out.printf("Por favor, digite um número "
			  + "com duas ou mais casas decimais: %n");

	float numero = scanner.nextFloat();

	System.out.printf("%d%n", (int) numero);
    }

}
