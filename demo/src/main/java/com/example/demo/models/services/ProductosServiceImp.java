package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Productos;
import com.example.demo.models.dao.IProductosDao;

@Service
public class ProductosServiceImp implements IProductosService{

    @Autowired
    private IProductosDao PD;

    @Override
    @Transactional(readOnly=true)
    public List<Productos> findAll() {
        return (List<Productos>) PD.findAll();
    }

    @Override
    public Productos findById(Long Id) {
        return PD.findById(Id).orElse(null);
    }

    @Override
    public void delete(Long Id) {
        PD.deleteById(Id);
    }

    @Override
    @Transactional
    public Productos save(Productos productos) {
        return PD.save(productos);
    }
}