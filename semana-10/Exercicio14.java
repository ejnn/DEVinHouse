import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.stream.DoubleStream;
import java.util.Arrays;

class Exercicio14 {

    private static BinaryOperator<Double> getReducer(String id) {

	BinaryOperator<Double> reducer;

	switch (id) {
	case "somar":
	    reducer = (acc, cur) -> acc + cur;
	    break;
	case "subtrair":
	    reducer = (acc, cur) -> acc - cur;
	    break;
	case "multiplicar":
	    reducer = (acc, cur) -> acc * cur;
	    break;
	case "dividir":
	    reducer = (acc, cur) -> acc / cur;
	    break;
	default:
	    return getReducer("somar");
	}

	return reducer;
    }

    public static void main(String... args) {

	Scanner scanner = new Scanner(System.in);

	Double[] arguments = new Double[2];
	
	System.out.printf("Por favor, insira o primeiro argumento:%n");
	arguments[0] = Double.valueOf(scanner.nextLine().trim());

	System.out.printf("e agora, o segundo:%n");
	arguments[1] = Double.valueOf(scanner.nextLine().trim());

	System.out.printf("Finalmente, digite uma operação "
			  + "(somar, subtrair, multiplicar ou dividir):%n");

	String reducerId = scanner.nextLine().trim();

	System.out.printf("Resultado: %.2f%n",
			  Arrays.stream(arguments)
			  .reduce(getReducer(reducerId)).get());
    }
    
}
