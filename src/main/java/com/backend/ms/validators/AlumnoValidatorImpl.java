package com.backend.ms.validators;

import com.backend.ms.models.AlumnoModel;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AlumnoValidatorImpl implements ConstraintValidator<AlumnoValidator, AlumnoModel>{

    @Override
    public boolean isValid(AlumnoModel model, ConstraintValidatorContext contexto) {
        contexto.buildConstraintViolationWithTemplate("error personalizado")
        .addPropertyNode("rfc")
        .addConstraintViolation();
        return true;
    }

}
