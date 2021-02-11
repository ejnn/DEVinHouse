import java.util.Scanner;

class Exercicio09 {

    public static void main(String... args) {

	Scanner scanner = new Scanner(System.in);

	System.out.printf("Por favor, digite um nome qualquer:%n");
	String nome = scanner.nextLine();

	System.out.printf("Esse nome possui %d letras!%n", nome.length());
    }
    
}
