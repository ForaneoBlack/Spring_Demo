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

import com.example.demo.entity.Vendedor;
import com.example.demo.models.services.IVendedorService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/vendedor")
public class VendedorRestController {
	// Listar vendedor
	@Autowired
	private IVendedorService IV;

	@GetMapping("/vendedor")
	public List<Vendedor> index() {
		return IV.findAll();
	}

	// Bucar vendedor por id_vendedor
	@GetMapping("/vendedor/{id_vendedor}")
	public Vendedor show(@PathVariable Long id_vendedor) {
		return IV.findById(id_vendedor);
	}

	// Guardar Vendedor
	@PostMapping("/vendedor")
	@ResponseStatus(HttpStatus.CREATED)
	public Vendedor create(@RequestBody Vendedor vendedor) {
		return IV.save(vendedor);

	}

	// actualizar Vendedor

	@PutMapping("/vendedor/{id_vendedor}")
	@ResponseStatus(HttpStatus.CREATED)
	public Vendedor update(@RequestBody Vendedor vendedor, @PathVariable Long id_vendedor) {
		Vendedor vendedorActual = IV.findById(id_vendedor);
		vendedorActual.setNombre(vendedor.getNombre());
		vendedorActual.setApellidos(vendedor.getApellidos());
		vendedorActual.setDireccion(vendedor.getDireccion());
		vendedorActual.setTelefono(vendedor.getTelefono());
		vendedorActual.setEmail(vendedor.getEmail());
		return IV.save(vendedorActual);

	}

	// eliminar Vendedor

	@DeleteMapping("/vendedor/{id_vendedor}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id_vendedor) {
		IV.delete(id_vendedor);
	}

}
