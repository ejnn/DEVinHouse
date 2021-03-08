import java.util.Scanner;
import java.math.BigInteger;


class Exercicio12 {

    public static void main(String... args) {

	Scanner scanner = new Scanner(System.in);

	System.out.printf("Por favor, insira um número inteiro%n");

	BigInteger number = new BigInteger(scanner.nextLine().trim());

	System.out.printf("Esse número é %s.%n",
			  number.mod(BigInteger.valueOf(2))
			  .equals(BigInteger.valueOf(0)) ? "par" : "ímpar");
    }

}
