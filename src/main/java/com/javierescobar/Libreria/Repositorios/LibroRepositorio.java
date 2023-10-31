package com.javierescobar.Libreria.Repositorios;

import com.javierescobar.Libreria.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long> {
    Libro findByTitulo(String title);
}
