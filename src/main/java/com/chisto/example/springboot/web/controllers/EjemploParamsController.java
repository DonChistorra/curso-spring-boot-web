package com.chisto.example.springboot.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

	@GetMapping("/")
	public String index(Model model) {
		return "/params/index";
	}

	@GetMapping("/string")
	public String param(@RequestParam(required = false, defaultValue = "someValue") String texto, Model model) {
		model.addAttribute("textoRecibido", "Texto recibido: " + texto);
		return "/params/ver";
	}

	@GetMapping("/varios-params")
	public String param(@RequestParam(defaultValue = "someValue") String saludo,
			@RequestParam(defaultValue = "5") Integer numero, Model model) {
		model.addAttribute("textoRecibido", "Texto recibido: " + saludo);
		model.addAttribute("numeroRecibido", "Número recibido: " + numero);
		return "/params/ver-varios";
	}

	@ModelAttribute("basicos")
	public Map<String, String> poblarBasicos() {
		Map<String, String> usuarios = new HashMap<String, String>();
		usuarios.put("titulo", "Titulo configurado por Spring");
		usuarios.put("mensaje_bienvenida", "Welcome Springer!");
		return usuarios;
	}

}
