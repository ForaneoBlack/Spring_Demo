package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Vendedor;
import com.example.demo.models.dao.IVendedorDao;

@Service
public class VendedorServiceImp implements IVendedorService {

    @Autowired
    private IVendedorDao VD;

    @Override
    @Transactional(readOnly=true)
    public List<Vendedor> findAll() {
        return (List<Vendedor>) VD.findAll();
    }

    @Override
    public Vendedor findById(Long Id) {
        return VD.findById(Id).orElse(null);
    }

    @Override
    public void delete(Long Id) {
        VD.deleteById(Id);
    }

    @Override
    @Transactional
    public Vendedor save(Vendedor vendedors) {
        return VD.save(vendedors);
    }
}
