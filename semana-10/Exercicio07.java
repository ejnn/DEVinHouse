import java.util.Scanner;

class Exercicio07 {

    public static void main(String... args) {

	Scanner scanner = new Scanner(System.in);

	System.out.printf("Qual o seu nome?%n");
	String nome = scanner.nextLine();

	System.out.printf("E seu sobrenome?%n");
	String sobrenome = scanner.nextLine();

	System.out.printf("Olá, %s.", nome + " " + sobrenome);
    }
    
}
