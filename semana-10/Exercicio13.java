import java.util.Scanner;
import java.util.stream.IntStream;

class Exercicio13 {

    public static void main(String... args) {

	Scanner scanner = new Scanner(System.in);

	System.out.printf("Por favor insira suas três notas para o cálculo da média%n");
	
	double finalGrade = IntStream.range(0,3)
	    .asDoubleStream()
	    .map(nota -> Double.valueOf(scanner.nextLine().trim()))
	    .average().getAsDouble();

	System.out.printf("Sua média final é %.2f%n", finalGrade);
    }
    
}
