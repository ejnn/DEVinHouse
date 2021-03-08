import java.util.Scanner;
import java.util.stream.IntStream;

class Exercicio13 {

    public static void main(String... args) {

	Scanner input = new Scanner(System.in);

	System.out.printf("Por favor insira suas três notas para o cálculo da média%n");

	final int AMOUNT_OF_GRADES = 3;
	double finalGrade = IntStream.range(0,AMOUNT_OF_GRADES).asDoubleStream()
	    .map(nota -> Double.valueOf(input.nextLine()))
	    .average().getAsDouble();

	System.out.printf("Sua média final é %.2f%n", finalGrade);
    }
    
}
