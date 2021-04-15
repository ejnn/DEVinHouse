package ejn.semana6123;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/imprimir")
public class Exercicio1 {

    @GetMapping
    public String home() {
	return "Olá Mundo";
    }
}
