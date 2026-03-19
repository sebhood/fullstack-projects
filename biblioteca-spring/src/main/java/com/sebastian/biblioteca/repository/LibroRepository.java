package com.sebastian.biblioteca.repository;

import com.sebastian.biblioteca.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    public Libro buscarPorId(int id) {
        return listaLibros.stream()
                .filter(libro -> libro.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Libro guardar(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }

    public Libro actualizar(int id, Libro libroActualizado) {
        Libro libro = buscarPorId(id);
        if (libro != null) {
            libro.setIsbn(libroActualizado.getIsbn());
            libro.setTitulo(libroActualizado.getTitulo());
            libro.setEditorial(libroActualizado.getEditorial());
            libro.setFechaPublicacion(libroActualizado.getFechaPublicacion());
            libro.setAutor(libroActualizado.getAutor());
        }
        return libro;
    }

    public void eliminar(int id) {
        listaLibros.removeIf(libro -> libro.getId() == id);
    }
}