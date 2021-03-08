import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

class Exercicio11 {

    public static void main(String... args) {

	Scanner scanner = new Scanner(System.in);
	LocalDate currentDate = LocalDate.now();
	
	System.out.printf("Qual a sua data de nascimento? (exemplo: %s)%n", currentDate.toString());
	LocalDate birthDate = LocalDate.parse(scanner.nextLine().trim());

	Period periodAlive = Period.between(birthDate, currentDate);

	System.out.printf("Você é %s de idade.%n", periodAlive.getYears() >= 18 ? "maior" : "menor");
    }
    
}
