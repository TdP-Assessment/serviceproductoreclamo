package com.prueba.producto.service;

import java.util.List;

import com.prueba.producto.model.Producto;



public interface IProductoService {
	public List<Producto> findAll();
	public Producto findById(Long id);

}
