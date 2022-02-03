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

import com.example.demo.entity.Empleados;
import com.example.demo.models.services.IEmpleadoService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/empleado")

public class EmpleadoRestController {
	
	//Listar empleados
		@Autowired
		private IEmpleadoService IE;
		@GetMapping("/empleados")
		public List<Empleados> index(){
			return IE.findAll();
		}
		//Bucar empleado por dno
		@GetMapping("/empleados/{dno}")
		public Empleados show (@PathVariable Long dno) {
			return IE.findById(dno);
		}
		
		//Guardar Empleado
		@PostMapping("/empleados")
		@ResponseStatus(HttpStatus.CREATED)
		public Empleados create (@RequestBody Empleados empleados) {
			return IE.save(empleados);
			
		}
		
		//actualizar Empleado
		
		@PutMapping("/empleados/{dno}")
		@ResponseStatus(HttpStatus.CREATED)
		public Empleados update(@RequestBody Empleados empleados, @PathVariable Long dno) {
			Empleados empleadoActual = IE.findById(dno);
			empleadoActual.setNombreemp(empleados.getNombreemp());
			empleadoActual.setApellidoemp(empleados.getApellidoemp());
			empleadoActual.setCi(empleados.getCi());
			empleadoActual.setDireccion(empleados.getDireccion());
			empleadoActual.setSexoemp(empleados.getSexoemp());
			empleadoActual.setSalarioemp(empleados.getSalarioemp());
			empleadoActual.setSuperci(empleados.getSuperci());
			empleadoActual.setFecha_n(empleados.getFecha_n());
			
			return IE.save(empleadoActual);
			
		}
		
		//eliminar Empleado
		
		@DeleteMapping("/empleados/{dno}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long dno) {
			IE.delete(dno);
		}

}
