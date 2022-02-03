package com.example.demo.models.services;

import java.util.List;

import com.example.demo.entity.*;
public interface IProductosService {
	
	public List<Productos> findAll();

    public Productos findById(Long Id);

    public void delete(Long Id);

    public Productos save(Productos productos);
}
