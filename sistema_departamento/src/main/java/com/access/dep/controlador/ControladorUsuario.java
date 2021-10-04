package com.access.dep.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.access.dep.entidad.Trabajadores;
import com.access.dep.repositorios.RolRepositorio;
import com.access.dep.servicios.TrabajadorServicio;

@Controller
public class ControladorUsuario {
	
	@Autowired
	TrabajadorServicio trabajadorServicio;
	
	@Autowired
	RolRepositorio rolRepositorio;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/inicio")
	public String getFormTrabajador(Model modelo) {
		//modelo.addAttribute("roles",rolRepositorio.findAll());
		modelo.addAttribute("formUsuario", new Trabajadores());
		modelo.addAttribute("listaTrabajador", trabajadorServicio.getAllUsers());
		
		return "form-usuario/vista-usuario";
	}	
}