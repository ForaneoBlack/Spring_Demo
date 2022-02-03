package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long> {
	
}
