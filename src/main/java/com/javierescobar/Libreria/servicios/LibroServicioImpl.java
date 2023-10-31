package com.javierescobar.Libreria.servicios;

import com.javierescobar.Libreria.Repositorios.LibroRepositorio;
import com.javierescobar.Libreria.modelos.Libro;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class LibroServicioImpl implements LibroServicio{
    private final LibroRepositorio libroRepositorio;
    @Override
    public List<Libro> findAllLibros() {
        return libroRepositorio.findAll();
    }

    @Override
    public String saveLibro(Libro libro) {
        libroRepositorio.save(libro);
        return "Libro guardado correctamente";
    }

    @Override
    public Libro findLibroTitulo(String title) {
       return libroRepositorio.findByTitulo(title);
    }

    @Override
    public Libro findLibroIsbn(Long id) {
        return libroRepositorio.findById(id).orElseThrow();
    }

    @Override
    public String updateLibro(Long isbn, Libro libro) {
        Libro libroOld = libroRepositorio.findById(isbn).orElseThrow();
        libroOld.setTitulo(libro.getTitulo());
        libroOld.setEjemplares(libro.getEjemplares());
        libroOld.setEjemplaresRestantes(libro.getEjemplaresRestantes());
        libroOld.setEjemplaresPrestados(libro.getEjemplaresPrestados());
        libroOld.setAlta(libro.isAlta());
        libroOld.setAnio(libro.getAnio());
        libroOld.setAutor(libro.getAutor());
        libroOld.setEditorial(libro.getEditorial());

        libroRepositorio.save(libro);
        return  "libro: "+ libro.getTitulo() +" fue actualizado correctamente";
    }

    @Override
    public String deleteLibro(Long isbn) {
        libroRepositorio.deleteById(isbn);
        return "el libro: " + isbn + " fue eliminado";
    }

    @Override
    public String bajaLibro(Long isbn) {
       Libro libro = libroRepositorio.findById(isbn).orElseThrow();
       libro.setAlta(false);
       libroRepositorio.save(libro);
        return "El libro"+libro.getTitulo()+"fue dado de baja";
    }
}
