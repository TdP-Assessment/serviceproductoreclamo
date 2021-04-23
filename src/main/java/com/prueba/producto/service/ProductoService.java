package com.prueba.producto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.producto.dao.ProductoDao;
import com.prueba.producto.model.Producto;

@Service
public class ProductoService implements IProductoService{
	
	@Autowired
	ProductoDao productoDao;

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

}
