package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="productos")
public class Productos implements Serializable {

    //Datos Productos
    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_productos;

    @Column
    private String nombre = null;
    private String descripcion;
    private int costo;
    private int stock;

    public Long getId_productos() {
        return id_productos;
    }

    public void setId_productos(Long id_productos) {
        this.id_productos = id_productos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
