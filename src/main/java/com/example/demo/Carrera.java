package com.example.demo;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;



@Entity // This tells Hibernate to make a table out of this class
@Table(name = "carreras")
public class Carrera {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

    private String nombre;

    @OneToMany(targetEntity = Curso.class, mappedBy=)
    private Set<Curso> cursos = new HashSet<Curso>();

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
}
