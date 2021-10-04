package com.access.dep.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.access.dep.entidad.Trabajadores;
import com.access.dep.repositorios.TrabajadorRepositorio;

@Service
public class TrabajadorServicioImpl implements TrabajadorServicio{
	
	@Autowired
	TrabajadorRepositorio repositorio;

	@Override
	public Iterable<Trabajadores> getAllUsers() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

}
