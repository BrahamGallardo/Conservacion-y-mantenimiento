package com.access.dep.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorUsuario {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/inicio")
	public String getUserForm() {
		return "form-usuario/vista-usuario";
	}	
}