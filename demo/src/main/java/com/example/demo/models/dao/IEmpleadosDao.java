package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entity.Empleados;

public interface IEmpleadosDao extends CrudRepository<Empleados, Long>{

}
