package br.com.devinhouse.springing.service;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

@Service
public class ShoutingService{

    public ShoutingService(@Value("${noun}") String noun,
			   @Value("${verb}") String verb,
			   @Value("${predicate}") String predicate) {
	System.out.println(noun + " " + verb + " " + predicate + ".");
    }
}
