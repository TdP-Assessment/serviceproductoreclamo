package com.prueba.producto.dao;

import org.springframework.data.repository.CrudRepository;


import com.prueba.producto.model.Producto;

public interface ProductoDao extends CrudRepository<Producto,Long>  {


}
