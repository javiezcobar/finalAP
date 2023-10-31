package com.javierescobar.Libreria.servicios;

import com.javierescobar.Libreria.Repositorios.EditorialRepositorio;
import com.javierescobar.Libreria.modelos.Autor;
import com.javierescobar.Libreria.modelos.Editorial;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EditorialServicioImpl implements EditorialServicio{
    private final EditorialRepositorio editorialRepositorio;
    @Override
    public List<Editorial> findAlleditoriales() {
        return editorialRepositorio.findAll();
    }

    @Override
    public Editorial findEditorial(String nombre) {
        return editorialRepositorio.findByNombre(nombre);
    }

    @Override
    public String saveEditorial(Editorial editorial) {
        editorialRepositorio.save(editorial);
        return "Editorial: "+editorial.getNombre()+" guardado correctamente";
    }

    @Override
    public String updateEditorial(Long id, Editorial editorial) {
        Editorial editorialN = editorialRepositorio.findById(id).orElseThrow();
        editorialN.setNombre(editorial.getNombre());
        editorialN.setAlta(editorial.isAlta());
        editorialN.setLibro(editorial.getLibro());
        editorialRepositorio.save(editorialN);
        return  "Autor: "+ editorialN.getNombre() +" fue actualizado correctamente";
    }

    @Override
    public String bajaEditorial(Long id) {
        Editorial editorial = editorialRepositorio.findById(id).orElseThrow();
        editorial.setAlta(false);
        editorialRepositorio.save(editorial);
        return "El Autor: "+editorial.getNombre()+" fue dado de baja";
    }

    @Override
    public String DeleteEditorial(Long id) {
        editorialRepositorio.deleteById(id);
        return "el editorial: " + id + " fue eliminado";
    }
}
