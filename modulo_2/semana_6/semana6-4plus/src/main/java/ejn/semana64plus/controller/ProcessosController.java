package ejn.semana64plus.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProcessosController {

    @GetMapping("/v1/processos")
    public String processos() {
	return "huzzah!";
    }
}
