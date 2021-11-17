package com.sergiojimenez.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaController {

	@GetMapping("/p1")
	public String pruebaP1() {
		System.out.println("PruebaController pruebaP1 Hola mundo");
		return "";
	}

	@GetMapping("/p2")
	public String pruebaP2(@RequestBody String frase) { // ó RequestParam en caso de puro String
		System.out.println("PruebaController pruebaP2 " + frase);
		return "";
	}

}
