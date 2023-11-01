package com.javierescobar.Libreria.modelos;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


class EditorialTest {
    private final Set<Libro> libros = new HashSet<>();
    private Editorial editorial = new Editorial(1L, libros,"editorial",true);

    @Test
    void getIdTest() {
        assertEquals(1L,editorial.getId());
        assertNotNull(editorial.getId());
    }

    @Test
    void getLibroTest() {
        assertEquals(libros, editorial.getLibro());
        assertNotNull(editorial.getLibro());
    }

    @Test
    void getNombreTest() {
        assertEquals("editorial",editorial.getNombre());
        assertNotNull(editorial.getNombre());
    }

    @Test
    void isAltaTest() {
        assertTrue(editorial.isAlta());
    }

    @Test
    void setIdTest() {
        editorial.setId(2L);
        assertEquals(2L,editorial.getId());
        assertNotNull(editorial.getId());
    }

    @Test
    void setLibroTest() {
        Set<Libro> NewLibros = new HashSet<>();
        editorial.setLibro(NewLibros);
        assertEquals(NewLibros, editorial.getLibro());
        assertNotNull(editorial.getLibro());
    }

    @Test
    void setNombreTest() {
        editorial.setNombre("editorial2");
        assertEquals("editorial2",editorial.getNombre());
        assertNotNull(editorial.getNombre());
    }

    @Test
    void setAltaTest() {
        editorial.setAlta(false);
        assertFalse(editorial.isAlta());
    }
}