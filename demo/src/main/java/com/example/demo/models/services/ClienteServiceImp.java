package com.example.demo.models.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Cliente;
import com.example.demo.models.dao.IClienteDao;

@Service
public class ClienteServiceImp implements IClienteService{

	@Autowired
	private IClienteDao CD;
	
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) CD.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long Id) {
		return CD.findById(Id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long Id) {
		CD.deleteById(Id);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return CD.save(cliente);
	}


	
	
	
	 
}
