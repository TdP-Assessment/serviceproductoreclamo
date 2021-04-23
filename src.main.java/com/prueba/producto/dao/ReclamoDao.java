package com.prueba.producto.dao;

import org.springframework.data.repository.CrudRepository;

import com.prueba.producto.model.Reclamo;



public interface ReclamoDao extends CrudRepository<Reclamo,Long> {

}
