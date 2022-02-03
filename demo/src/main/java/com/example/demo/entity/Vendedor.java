package com.example.demo.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="vendedor")
public class Vendedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id_vendedor;
    
    @Column
    private String nombre = null;
    private String apellidos = null;
    private String direccion = null;
    private String telefono = null;
    private String email= null;

    public Long getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(Long id_vendedor) {
        this.id_vendedor = id_vendedor;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
