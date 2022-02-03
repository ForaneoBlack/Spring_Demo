package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Productos;

public interface IProductosDao extends CrudRepository<Productos, Long> {

}
