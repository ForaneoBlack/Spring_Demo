package com.example.demo.models.services;

import java.util.List;

import com.example.demo.entity.Empleados;

public interface IEmpleadoService {

	public List<Empleados> findAll();

    public Empleados findById(Long dno);

    public void delete(Long dno);

    public Empleados save(Empleados empleados);
    
}
