package ejn.semana6123;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.util.MultiValueMap;

@RestController
@RequestMapping("/parametros")
public class Exercicio2 {

    @GetMapping
    public String home(@RequestParam MultiValueMap<String,String> queries) {

	if (queries.size() < 3) {
	    return "Por favor, adicione 3 queries na URI";
	}

	StringBuilder ret = new StringBuilder();
	queries.forEach((k, v) -> ret.append(k + ": " + v + "<br/>"));
	return ret.toString();
    }
}
