package com.example.demo.models.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.entity.Empleados;
import com.example.demo.models.dao.IEmpleadosDao;

@Service
public class EmpleadoServiceImp implements IEmpleadoService{

    @Autowired
    private IEmpleadosDao ED;

    @Override
    @Transactional(readOnly=true)
    public List<Empleados> findAll() {
        return (List<Empleados>) ED.findAll();
    }
   
    @Override
    @Transactional(readOnly=true)
    public Empleados findById(Long dno) {
        return ED.findById(dno).orElse(null);
    }

    @Override
    public void delete(Long dno) {
        ED.deleteById(dno);
    }

    @Override
    @Transactional
    public Empleados save(Empleados empleados) {
        return ED.save(empleados);
    }
}
