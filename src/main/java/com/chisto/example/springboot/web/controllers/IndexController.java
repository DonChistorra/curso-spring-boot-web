package com.chisto.example.springboot.web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chisto.example.springboot.models.Usuario;

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
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {

		Usuario usuario = new Usuario();
		usuario.setNombre("Mario");
		usuario.setApellido1("López");
		usuario.setEmail("fake@fakemail.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Titulo configurado por Spring");
		model.addAttribute("mensaje_bienvenida", "Welcome Springer!");
		
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios = new ArrayList<>();
		Usuario usuario1 = new Usuario("Mario", "López", "fake@fakemail.com");
		Usuario usuario2 = new Usuario("Andrés", "Fernández", "fake2@fakemail.com");
		Usuario usuario3 = new Usuario("Rosa", "Melano", "real@reamail.com");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("titulo", "Titulo configurado por Spring");
		model.addAttribute("mensaje_bienvenida", "Welcome Springer!");
		
		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(
			new Usuario("Mario", "López", "fake@fakemail.com"),
			new Usuario("Andrés", "Fernández", "fake2@fakemail.com"),
			new Usuario("Rosa", "Melano", "real@reamail.com")
		);
		return usuarios;
	}

}


