package com.example.demo.entity;

import org.springframework.data.annotation.Id;


import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="empleados")
public class Empleados implements Serializable {

    //Datos Productos
    private static final long serialVersionUID = 1L;
    
    @javax.persistence.Id
   
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long dno;

    
    private String nombreemp;
    private String apellidoemp;
    private String ci;
    private String direccion;
    private String sexoemp;
    private int salarioemp;
    private int superci;

 
    @Temporal(TemporalType.DATE)
    private Date fecha_n;

    public Long getDno() {
        return dno;
    }

    public void setDno(Long dno) {
        this.dno = dno;
    }

    @PrePersist
    public void prePersist() {
        fecha_n = new Date();
    }


    public String getNombreemp() {
        return nombreemp;
    }

    public void setNombreemp(String nombreemp) {
        this.nombreemp = nombreemp;
    }

    public String getApellidoemp() {
        return apellidoemp;
    }

    public void setApellidoemp(String apellidoemp) {
        this.apellidoemp = apellidoemp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexoemp() {
        return sexoemp;
    }

    public void setSexoemp(String sexoemp) {
        this.sexoemp = sexoemp;
    }

    public int getSalarioemp() {
        return salarioemp;
    }

    public void setSalarioemp(int salarioemp) {
        this.salarioemp = salarioemp;
    }

    public int getSuperci() {
        return superci;
    }

    public void setSuperci(int superci) {
        this.superci = superci;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public Date getFecha_n() {
        return fecha_n;
    }

    public void setFecha_n(Date fecha_n) {
        this.fecha_n = fecha_n;
    }
}
