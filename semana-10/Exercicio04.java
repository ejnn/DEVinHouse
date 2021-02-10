import java.time.LocalTime;

class Exercicio04 {

    public static void main(String... args) {

	LocalTime horarioAtual = LocalTime.now();
	
	System.out.printf("Boa tarde! No momento, são %02d:%02d.",
			  horarioAtual.getHour(),
			  horarioAtual.getMinute()
			  );
    }

}
