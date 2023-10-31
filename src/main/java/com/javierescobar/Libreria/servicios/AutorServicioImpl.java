package com.javierescobar.Libreria.servicios;

import com.javierescobar.Libreria.Repositorios.AutorRepositorio;
import com.javierescobar.Libreria.modelos.Autor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AutorServicioImpl implements AutorServicio {
    private final AutorRepositorio autorRepositorio;
    @Override
    public List<Autor> findAllAutores() {
        return autorRepositorio.findAll();
    }

    @Override
    public Autor findAutor(String nombre) {
        return autorRepositorio.findByNombre(nombre);
    }

    @Override
    public String saveAutor(Autor autor) {
        autorRepositorio.save(autor);
        return "Autor: "+autor.getNombre()+" guardado correctamente";
    }

    @Override
    public String updateAutor(Long id, Autor autor) {
        Autor autorN = autorRepositorio.findById(id).orElseThrow();
        autorN.setNombre(autor.getNombre());
        autorN.setAlta(autor.isAlta());
        autorN.setLibro(autor.getLibro());
        autorRepositorio.save(autorN);
        return  "Autor: "+ autor.getNombre() +" fue actualizado correctamente";

    }

    @Override
    public String bajaAutor(Long id) {
        Autor autorN = autorRepositorio.findById(id).orElseThrow();
        autorN.setAlta(false);
        autorRepositorio.save(autorN);
        return "El Autor: "+autorN.getNombre()+" fue dado de baja";
    }

    @Override
    public String DeleteAutor(Long id) {
        autorRepositorio.deleteById(id);
        return "el autor: " + id + " fue eliminado";
    }
}
