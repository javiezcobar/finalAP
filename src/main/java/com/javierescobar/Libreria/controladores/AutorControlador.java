package com.javierescobar.Libreria.controladores;

import com.javierescobar.Libreria.modelos.Autor;
import com.javierescobar.Libreria.servicios.AutorServicioImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/autores")
public class AutorControlador {
    private final AutorServicioImpl autorServicio;

    @GetMapping("/findAll")
    public ResponseEntity<List<Autor>> findAllAutores(){
        List<Autor> lista = autorServicio.findAllAutores();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<Autor> findAutorNombre(@RequestParam String nombre){
        return new ResponseEntity<>(autorServicio.findAutor(nombre), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveAutor(@RequestBody Autor autor){
        String txt = autorServicio.saveAutor(autor);
        return new ResponseEntity<>(txt, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateAutor(@RequestParam Long id, @RequestBody Autor autor){
        String txt = autorServicio.updateAutor(id, autor);
        return new ResponseEntity<>(txt, HttpStatus.CREATED);
    }

    @PutMapping("/baja/{id}")
    public ResponseEntity<String> bajaAutor(@RequestParam Long id){
        String txt = autorServicio.bajaAutor(id);
        return new ResponseEntity<>(txt, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAutor(@RequestParam Long id){
        String txt = autorServicio.DeleteAutor(id);
        return new ResponseEntity<>(txt, HttpStatus.OK);
    }
}
