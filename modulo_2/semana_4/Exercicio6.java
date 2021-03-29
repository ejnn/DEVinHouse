import java.io.IOException;

class ExceptionA extends Exception {}
class ExceptionB extends Exception {}

public class Exercicio6 {

    public static void main(String... args) throws Exception {

	Exception[] excecoes = {
	    new ExceptionA(),
	    new ExceptionB(),
	    new NullPointerException(),
	    new IOException()
	};

	for (Exception excecao : excecoes) {
	    try {
		System.out.printf("Lá vai um throw %s!%n", excecao.toString());
	   	throw excecao;
	    } 
	    catch (ExceptionA e) {
		System.out.println("ExceptionA foi pega!");
		continue;
	    } 
	    catch (ExceptionB e) {
		System.out.println("ExceptionB foi pega!");
		continue;
	    } 
	    catch (NullPointerException e) {
		System.out.println("NullPointerException foi pega!");
		continue;
	    } 
	    catch (IOException e) {
		System.out.println("IOException foi pega!");
		continue;
	    }
	}
    }

}
