package com.sebastian.biblioteca.controller;

import com.sebastian.biblioteca.model.Libro;
import com.sebastian.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService service;

    // GET - obtener todos los libros
    @GetMapping
    public List<Libro> obtenerLibros() {
        return service.obtenerLibros();
    }

    // GET - obtener libro por ID
    @GetMapping("/{id}")
    public Libro buscarPorId(@PathVariable int id) {
        return service.buscarPorId(id);
    }

    // POST - crear un libro
    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
        return service.guardar(libro);
    }

    // PUT - actualizar libro
    @PutMapping("/{id}")
    public Libro actualizar(@PathVariable int id, @RequestBody Libro libro) {
        return service.actualizar(id, libro);
    }

    // DELETE - eliminar libro
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        service.eliminar(id);
    }
}