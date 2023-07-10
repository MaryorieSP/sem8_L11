package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "curso")
public class Curso {
    
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

    private String nombre;
    private Integer creditos;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_carrera")
    private Carrera carrera;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getCreditos() {
        return creditos;
    }
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    
}
