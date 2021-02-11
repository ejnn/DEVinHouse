import java.util.Scanner;
import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.function.UnaryOperator;

class Exercicio16 {

    public static void main(String... args) {

	Scanner input = new Scanner(System.in);

	System.out.printf("Por favor, insira o valor inicial da progressão:%n");
	BigInteger initialValue = new BigInteger(input.nextLine());

	System.out.printf("Por favor, insira o valor da raíz:%n");
	BigInteger root = new BigInteger(input.nextLine()); // bad name...

	System.out.printf("PA ou PG?%n");
	String sequenceId = input.nextLine().trim();
	
	UnaryOperator<BigInteger> getTerm;

	switch(sequenceId) {
	case "PA":
	    getTerm = index -> initialValue.add(index.multiply(root));
	    break;
	default:
	    getTerm = index -> initialValue.multiply(root.pow(index.intValue()));
	}

	int SEQUENCE_SIZE = 10;

	Object[] sequence = IntStream.range(0,SEQUENCE_SIZE)
	    .mapToObj(i -> BigInteger.valueOf(i))
	    .map(getTerm)
	    .toArray();

	System.out.printf("Aqui está sua %s:%n", sequenceId);
	IntStream.range(0,10)
	    .forEach(i -> System.out.printf("%2d: %s%n", i, sequence[i].toString()));
    }
    
}
