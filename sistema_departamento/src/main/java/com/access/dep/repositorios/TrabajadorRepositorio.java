package com.access.dep.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.access.dep.entidad.Trabajadores;

@Repository
public interface TrabajadorRepositorio extends CrudRepository<Trabajadores,Long>{
	
}
