package com.chisto.example.springboot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {
//		El método redirect modifica la ruta,
//		mientras que forward no lo hace
//		return "redirect:/web/index/";
		return "forward:/web/index/";
	}
}
