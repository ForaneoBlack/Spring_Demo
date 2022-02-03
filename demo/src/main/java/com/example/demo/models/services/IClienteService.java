package com.example.demo.models.services;

import java.util.List;

import com.example.demo.entity.Cliente;

public interface IClienteService {
	
	public List <Cliente> findAll();
	
	public Cliente findById(Long Id);
	
	public void delete(Long Id);
	
	public Cliente save(Cliente cliente);
	
	
	
}

