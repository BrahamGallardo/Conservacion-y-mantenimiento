package com.access.dep.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.access.dep.entidad.Rol;

@Repository
public interface RolRepositorio extends CrudRepository<Rol, Long>{

}
