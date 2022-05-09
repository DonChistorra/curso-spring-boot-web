package com.chisto.example.springboot.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploPathVariableController {

	@GetMapping("/")
	public String index(Model model) {
		return "/variables/index";
	}
	
	@GetMapping("/texto/{textoRecibido}")
	public String textoString(@PathVariable String textoRecibido, Model model) {
		model.addAttribute("textoRecibido", textoRecibido);
		return "/variables/texto";
	}
	
	@GetMapping("/varios/{textoRecibido}/{numeroRecibido}")
	public String textoString(@PathVariable String textoRecibido,
			@PathVariable Integer numeroRecibido, Model model) {
		model.addAttribute("textoRecibido", textoRecibido);
		model.addAttribute("numeroRecibido", numeroRecibido);
		return "/variables/varios";
	}
	
	
	@ModelAttribute("basicos")
	public Map<String, String> poblarBasicos() {
		Map<String, String> usuarios = new HashMap<String, String>();
		usuarios.put("titulo", "Titulo configurado por Spring - PathVariables");
		usuarios.put("mensaje_bienvenida", "Welcome Springer! - Prácticas con @PathVariable");
		return usuarios;
	}
}
