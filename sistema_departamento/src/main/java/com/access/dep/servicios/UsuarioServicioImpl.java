package com.access.dep.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.access.dep.entidad.Usuario;
import com.access.dep.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{
	
	@Autowired
	UsuarioRepositorio repositorio;

	@Override
	public Iterable<Usuario> getAllUsers() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

}
