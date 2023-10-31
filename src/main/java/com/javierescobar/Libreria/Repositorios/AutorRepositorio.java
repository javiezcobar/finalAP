package com.javierescobar.Libreria.Repositorios;

import com.javierescobar.Libreria.modelos.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, Long> {
    Autor findByNombre(String nombre);
}
