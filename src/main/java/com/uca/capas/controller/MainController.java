package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

/* 	CREDENCIALES 
 	Usuario: Capas
  	Contrasena: 12345 */

@Controller
public class MainController {
	
	private String user="Capas";
	private String pass="12345";
	
	@GetMapping("/login")
	public String enviarForm(Usuario username) {
		return "login";
	}
	
	@PostMapping("/validacion")
	public String procesarForm(Usuario username){
		
		if(username.getUsername().equals(user) && username.getPassword().equals(pass)) {
			return "mostrarMensajeV";
		}else {
			return "mostrarMensajeF";
		}
		
	}
	
}
