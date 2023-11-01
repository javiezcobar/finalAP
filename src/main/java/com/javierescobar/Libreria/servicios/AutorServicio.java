package com.javierescobar.Libreria.servicios;

import com.javierescobar.Libreria.modelos.Autor;

import java.util.List;

public interface AutorServicio {
    List<Autor> findAllAutores();
    Autor findAutor(String nombre);
    String saveAutor(Autor autor);
    String updateAutor(Long id, Autor autor);
    String bajaAutor(Long id);
    String DeleteAutor(Long id);
}
