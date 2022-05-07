package com.chisto.example.springboot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web")
public class IndexController {

	@RequestMapping(value = {"", "/", "/home", "/index"}, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("titulo", "Titulo configurado por Spring");
		model.addAttribute("mensaje_bienvenida", "Welcome Springer!");
		String result = "index";
		return result;
	}
	
}
