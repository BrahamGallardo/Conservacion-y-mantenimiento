package com.access.dep.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.access.dep.entidad.Usuario;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Long>{
	
}
