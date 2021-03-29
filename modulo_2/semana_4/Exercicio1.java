public class Exercicio1 {

    public static void main(String... args) {

	final int ARRAY_SIZE = 3;

	int[][] matriz = new int[ARRAY_SIZE][ARRAY_SIZE];

	for (int i = 0; i < matriz.length; i++) {
	    for (int j = 0; j < matriz[i].length; j++) {
		matriz[i][j] = i + j;
	    }
	}
    }
}
