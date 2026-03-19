package com.sebastian.biblioteca.service;

import com.sebastian.biblioteca.model.Libro;
import com.sebastian.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    @Autowired
    private LibroRepository repository;

    public List<Libro> obtenerLibros() {
        return repository.obtenerLibros();
    }

    public Libro buscarPorId(int id) {
        return repository.buscarPorId(id);
    }

    public Libro guardar(Libro libro) {
        return repository.guardar(libro);
    }

    public Libro actualizar(int id, Libro libro) {
        return repository.actualizar(id, libro);
    }

    public void eliminar(int id) {
        repository.eliminar(id);
    }
}