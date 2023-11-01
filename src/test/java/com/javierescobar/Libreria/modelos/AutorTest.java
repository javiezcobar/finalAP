package com.javierescobar.Libreria.modelos;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AutorTest {
    private final Set<Libro> libros = new HashSet<>();
    private Autor autor = new Autor(1L,"autor",true,libros);

    @Test
    void getIdTest() {
        assertEquals(1L,autor.getId());
        assertNotNull(autor.getId());
    }

    @Test
    void getNombreTest() {
        assertEquals("autor",autor.getNombre());
        assertNotNull(autor.getNombre());
    }

    @Test
    void isAltaTest() {
        assertTrue(autor.isAlta());
    }

    @Test
    void getLibroTest() {
        assertEquals(libros, autor.getLibro());
        assertNotNull(autor.getLibro());
    }

    @Test
    void setIdTest() {
        autor.setId(2L);
        assertEquals(2L,autor.getId());
        assertNotNull(autor.getId());
    }

    @Test
    void setNombreTest() {
        autor.setNombre("nuevoAutor");
        assertEquals("nuevoAutor",autor.getNombre());
        assertNotNull(autor.getNombre());
    }

    @Test
    void setAltaTest() {
        autor.setAlta(false);
        assertFalse(autor.isAlta());
    }

    @Test
    void setLibroTest() {
        Set<Libro> newLibro = new HashSet<>();
        autor.setLibro(newLibro);
        assertEquals(newLibro, autor.getLibro());
        assertNotNull(autor.getLibro());
    }
}