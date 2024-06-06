package com.backend.ms.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AlumnoValidatorImpl.class)
public @interface AlumnoValidator {   
     String message() default "Error";
     Class<?>[] groups() default {};
     Class<? extends Payload>[] payload() default {};
} 