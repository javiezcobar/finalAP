package com.javierescobar.Libreria.servicios;

import com.javierescobar.Libreria.modelos.Libro;

import java.util.List;

public interface LibroServicio {
    List<Libro> findAllLibros();
    String saveLibro(Libro libro);
    Libro findLibroTitulo(String title);
    Libro findLibroIsbn(Long id);
    String updateLibro(Long id, Libro libro);
    String deleteLibro(Long id);
    String bajaLibro(Long id);
}
