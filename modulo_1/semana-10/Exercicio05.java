import java.util.Locale;

class Exercicio05 {

    public static void main(String... args) {

	String linguagemPadrao = Locale.getDefault().getDisplayLanguage();
	System.out.printf(linguagemPadrao);

    }
    
}
