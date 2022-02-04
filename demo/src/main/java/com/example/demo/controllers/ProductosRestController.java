package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Productos;
import com.example.demo.models.services.IProductosService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/Productos")

public class ProductosRestController {

	//Listar productos
		@Autowired
		private IProductosService IP;
		@GetMapping("/productos")
		public List<Productos> index(){
			return IP.findAll();
		}
		//Bucar producto por id_productos
		@GetMapping("/productos/{id_productos}")
		public Productos show (@PathVariable Long id_productos) {
			return IP.findById(id_productos);
		}
		
		//Guardar Productos
		@PostMapping("/productos")
		@ResponseStatus(HttpStatus.CREATED)
		public Productos create (@RequestBody Productos productos) {
			return IP.save(productos);
			
		}
		
		//actualizar Productos
		
		@PutMapping("/productos/{id_productos}")
		@ResponseStatus(HttpStatus.CREATED)
		public Productos update(@RequestBody Productos productos, @PathVariable Long id_productos) {
			Productos productoActual = IP.findById(id_productos);
			productoActual.setNombre(productos.getNombre());
			productoActual.setDescripcion(productos.getDescripcion());
			productoActual.setCosto(productos.getCosto());
			productoActual.setStock(productos.getStock());
			return IP.save(productoActual);
			
		}
		
		//eliminar Productos
		
		@DeleteMapping("/productos/{id_productos}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id_productos) {
			IP.delete(id_productos);
		}
}
