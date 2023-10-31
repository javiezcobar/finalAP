package com.javierescobar.Libreria.controladores;

import com.javierescobar.Libreria.modelos.Libro;
import com.javierescobar.Libreria.servicios.LibroServicioImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/libros")
public class LibroControlador {
    private final LibroServicioImpl libroServicio;

    @GetMapping("/findAll")
    public ResponseEntity<List<Libro>> findAllLibros(){
        List<Libro> lista = libroServicio.findAllLibros();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{titulo}")
    public ResponseEntity<Libro> findLibroTitulo(@RequestParam String titulo){
        return new ResponseEntity<>(libroServicio.findLibroTitulo(titulo), HttpStatus.OK);
    }

    @GetMapping("/findBy/{isbn}")
    public ResponseEntity<Libro> findLibroIsbn(@RequestParam Long isbn){
        return new ResponseEntity<>(libroServicio.findLibroIsbn(isbn), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveLibros(@RequestBody Libro libro){
        String txt = libroServicio.saveLibro(libro);
        return new ResponseEntity<>(txt, HttpStatus.CREATED);
    }

    @PutMapping("/{isbn}")
    public ResponseEntity<String> updateLibros(@RequestParam Long isbn, @RequestBody Libro libro){
        String txt = libroServicio.updateLibro(isbn, libro);
        return new ResponseEntity<>(txt, HttpStatus.CREATED);
    }

    @PutMapping("/baja/{isbn}")
    public ResponseEntity<String> bajaLibros(@RequestParam Long isbn){
        String txt = libroServicio.bajaLibro(isbn);
        return new ResponseEntity<>(txt, HttpStatus.CREATED);
    }

    @DeleteMapping("/{isbn}")
    public ResponseEntity<String> deleteLibro(@RequestParam Long isbn){
        String txt = libroServicio.deleteLibro(isbn);
        return new ResponseEntity<>(txt, HttpStatus.OK);
    }
}
