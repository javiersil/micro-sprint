package com.backend.ms.repositories;
import com.backend.ms.entities.Alumno;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
