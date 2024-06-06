package com.backend.ms.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class AlumnoModel {

    @NotEmpty(message = "No puede ser vacio")
    @Size(min = 3, max = 40, message = "No puede ser menor de 3 y mayor de 40")
    private String nombre;

    @NotEmpty(message = "El no puede ser vacio")
    @Pattern(message = "No cumple con un valor adecuado",
             regexp = "[A-ZÑ&]{3,4}\\d{6}[A-V1-9][A-Z1-9][0-9A]")
    private String rfc;

    public String getNombre() {
        return nombre;
    }

    public String getRfc() {
        return rfc;
    }
}
