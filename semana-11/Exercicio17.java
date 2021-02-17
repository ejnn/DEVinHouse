import java.util.stream.IntStream;

class Exercicio17 {

    public static void main(String... args) {

	for (int multiplier = 0; multiplier <= 9; multiplier++) {
	    for (int multiplicand = 1; multiplicand <= 10; multiplicand++) {
		System.out.printf("%dx%d = %d%n",
				  multiplier,
				  multiplicand,
				  multiplier * multiplicand);
	    }
	}
    }
    
}
