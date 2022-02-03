package com.example.demo.models.services;

import java.util.List;

import com.example.demo.entity.Vendedor;

public interface IVendedorService {


    public List<Vendedor> findAll();

    public Vendedor findById(Long Id);

    public void delete(Long Id);

    public Vendedor save(Vendedor vendedors);
}
