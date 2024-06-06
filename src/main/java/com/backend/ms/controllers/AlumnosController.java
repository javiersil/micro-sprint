package com.backend.ms.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.ms.entities.Alumno;
import com.backend.ms.models.AlumnoModel;
import com.backend.ms.services.AlumnosService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/alumnos")
public class AlumnosController {
    private final AlumnosService service;

    public AlumnosController(AlumnosService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> obtiene(@PathVariable("id")long id) {
        return ResponseEntity.ok().body(service.obtiene(id));
     }

    @PostMapping()
    public ResponseEntity<Alumno> guarda(@RequestBody @Valid AlumnoModel modelo) {
       return ResponseEntity.ok().body(service.guarda(modelo));
    }

}
