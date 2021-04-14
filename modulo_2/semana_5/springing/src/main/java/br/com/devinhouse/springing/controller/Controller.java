package br.com.devinhouse.springing.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.devinhouse.springing.service.BebidaService;

@RestController
@RequestMapping("/bebendo")
public class Controller {

    private final BebidaService bebidaService;

    public Controller(BebidaService bebidaService) {
	this.bebidaService = bebidaService;
    }

    @GetMapping
    public String home() {
	return "atualmente, bebendo um(a) " + bebidaService.getBebida();
    }
 }
