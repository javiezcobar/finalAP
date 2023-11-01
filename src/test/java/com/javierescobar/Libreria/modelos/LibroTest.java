package com.javierescobar.Libreria.modelos;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
    private final Set<Autor> autores = new HashSet<>();
    private final Editorial editorial = new Editorial();
    private Libro libro = new Libro(1L,"titulo",2023,12,10,2,true, autores,editorial);

    @Test
    void getIsbnTest() {
        assertEquals(1L, libro.getIsbn());
        assertNotNull(libro.getIsbn());
    }

    @Test
    void getTituloTest() {
        assertEquals("titulo", libro.getTitulo());
        assertNotNull(libro.getTitulo());
    }

    @Test
    void getAnioTest() {
        assertEquals(2023, libro.getAnio());
        assertNotNull(libro.getAnio());
    }

    @Test
    void getEjemplaresTest() {
        assertEquals(12,libro.getEjemplares());
        assertNotNull(libro.getEjemplares());
    }

    @Test
    void getEjemplaresPrestadosTest() {
        assertEquals(10,libro.getEjemplaresPrestados());
        assertNotNull(libro.getEjemplaresPrestados());
    }

    @Test
    void getEjemplaresRestantesTest() {
        assertEquals(2, libro.getEjemplaresRestantes());
        assertNotNull(libro.getEjemplaresRestantes());
    }

    @Test
    void isAltaTest() {
        assertTrue(libro.isAlta());
    }

    @Test
    void getAutorTest() {
        assertEquals(autores, libro.getAutor());
        assertNotNull(libro.getAutor());
    }

    @Test
    void getEditorialTest() {
        assertEquals(editorial, libro.getEditorial());
        assertNotNull(libro.getEditorial());
    }

    @Test
    void setIsbnTest() {
        libro.setIsbn(2L);
        assertEquals(2L, libro.getIsbn());
        assertNotNull(libro.getIsbn());
    }

    @Test
    void setTituloTest() {
        libro.setTitulo("tituloNew");
        assertEquals("tituloNew", libro.getTitulo());
        assertNotNull(libro.getTitulo());

    }

    @Test
    void setAnioTest() {
        libro.setAnio(2020);
        assertEquals(2020, libro.getAnio());
        assertNotNull(libro.getAnio());

    }

    @Test
    void setEjemplaresTest() {
        libro.setEjemplares(13);
        assertEquals(13,libro.getEjemplares());
        assertNotNull(libro.getEjemplares());
    }

    @Test
    void setEjemplaresPrestadosTest() {
        libro.setEjemplaresPrestados(5);
        assertEquals(5,libro.getEjemplaresPrestados());
        assertNotNull(libro.getEjemplaresPrestados());
    }

    @Test
    void setEjemplaresRestantesTest() {
        libro.setEjemplaresRestantes(9);
        assertEquals(9, libro.getEjemplaresRestantes());
        assertNotNull(libro.getEjemplaresRestantes());
    }

    @Test
    void setAltaTest() {
        libro.setAlta(false);
        assertFalse(libro.isAlta());
    }

    @Test
    void setAutorTest() {
        Set<Autor> autoresTest = new HashSet<>();
        libro.setAutor(autoresTest);
        assertEquals(autores, libro.getAutor());
        assertNotNull(libro.getAutor());
    }

    @Test
    void setEditorialTest() {
        Editorial editorial1 = new Editorial();
        libro.setEditorial(editorial1);
        assertEquals(editorial, libro.getEditorial());
        assertNotNull(libro.getEditorial());
    }
}