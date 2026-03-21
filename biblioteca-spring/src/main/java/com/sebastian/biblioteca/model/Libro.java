package com.sebastian.biblioteca.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NotBlank
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Libro {
    
    private int id;

    @NotBlank(message = "El ISBN es obligatorio")
    private String isbn;

    @NotBlank(message = "El titulo es obligatorio")
    private String titulo;

    private String editorial;

    @Min(value = 1900, message = "Fecha inválida")
    private int fechaPublicacion;

    @NotBlank(message = "El autor es obligatorio")
    private String autor;
}
