package com.javierescobar.Libreria.Repositorios;

import com.javierescobar.Libreria.modelos.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorialRepositorio extends JpaRepository<Editorial, Long> {
    Editorial findByNombre(String nombre);
}
