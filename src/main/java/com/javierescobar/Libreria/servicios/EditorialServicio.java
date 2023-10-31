package com.javierescobar.Libreria.servicios;

import com.javierescobar.Libreria.modelos.Editorial;

import java.util.List;

public interface EditorialServicio {
    List<Editorial> findAlleditoriales();
    Editorial findEditorial(String nombre);
    String saveEditorial(Editorial editorial);
    String updateEditorial(Long id, Editorial editorial);
    String bajaEditorial(Long id);
    String DeleteEditorial(Long id);
}
