package com.backend.ms.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.ms.entities.Alumno;
import com.backend.ms.exceptions.Error204Exception;
import com.backend.ms.models.AlumnoModel;
import com.backend.ms.repositories.AlumnoRepository;

@Service
public class AlumnosService {
    private final AlumnoRepository repository;

    public AlumnosService(AlumnoRepository repository) {
        this.repository = repository;
    }

    @Transactional()
    public Alumno guarda(AlumnoModel modelo) {
        /*
        if (modelo.getNombre() == null || modelo.getNombre().trim().equals("")) {
            throw new Error409Exception("El nombre del alumno no puede ser vacio");
        }
        */

        var alumno = new Alumno(modelo);
        return repository.save(alumno);
    }

    public Alumno obtiene(long id) {
        return repository.findById(id)
          .orElseThrow(() -> new Error204Exception());
    }
}
