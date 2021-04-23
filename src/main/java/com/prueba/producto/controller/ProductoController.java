package com.prueba.producto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.producto.model.Producto;
import com.prueba.producto.service.ProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	ProductoService productoService;

	@GetMapping("/listar") 
	public List<Producto> getList(){
		return productoService.findAll();
		
	}
	@GetMapping("/ver/{id}") 
	public Producto detalle(@PathVariable Long id){
		return productoService.findById(id);
		
	}
	
}
