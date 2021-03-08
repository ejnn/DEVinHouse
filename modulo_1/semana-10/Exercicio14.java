import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.stream.DoubleStream;
import java.util.Arrays;

class Exercicio14 {

    public static void main(String... args) {

	Scanner scanner = new Scanner(System.in);
	
	System.out.printf("Por favor, insira o primeiro argumento:%n");
	Double firstArg = Double.valueOf(scanner.nextLine());

	System.out.printf("e agora, o segundo:%n");
	Double secondArg = Double.valueOf(scanner.nextLine());

	System.out.printf("Finalmente, digite uma operação "
			  + "(somar, subtrair, multiplicar ou dividir):%n");

	String operatorId = scanner.nextLine().trim();

	System.out.printf("Resultado: %.2f%n", getBinaryOperator(operatorId).apply(firstArg, secondArg));
    }

    private static BinaryOperator<Double> getBinaryOperator(String id) {

	BinaryOperator<Double> binaryOperator;

	switch (id) {

	case "somar":
	    binaryOperator = (a, b) -> a + b;
	    break;

	case "subtrair":
	    binaryOperator = (a, b) -> a - b;
	    break;

	case "multiplicar":
	    binaryOperator = (a, b) -> a * b;
	    break;

	case "dividir":
	    binaryOperator = (a, b) -> a / b;
	    break;

	default:
	    return getBinaryOperator("somar");
	}

	return binaryOperator;
    }
    
}
