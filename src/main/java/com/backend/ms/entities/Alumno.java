package com.backend.ms.entities;

import com.backend.ms.models.AlumnoModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="alumno_seq", allocationSize=1)
public class Alumno {
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_seq")
    private long id;	

    @Column(name = "nombre", length = 40, nullable = false)
    private String nombre;

    public Alumno(AlumnoModel modelo) {
        this.nombre = modelo.getNombre();
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return this.nombre;
    }
}