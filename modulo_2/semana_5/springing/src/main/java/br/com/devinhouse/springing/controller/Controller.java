package br.com.devinhouse.springing.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/chimarrao")
public class Controller {

    @GetMapping
    public String chimarrao() {

	return "bomba chiando, piá";
    }
 }
