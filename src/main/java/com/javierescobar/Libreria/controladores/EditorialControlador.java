package com.javierescobar.Libreria.controladores;

import com.javierescobar.Libreria.modelos.Editorial;
import com.javierescobar.Libreria.servicios.EditorialServicioImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/editoriales")
public class EditorialControlador {
    private final EditorialServicioImpl editorialServicio;

    @GetMapping("/findAll")
    public ResponseEntity<List<Editorial>> findAllEditoriales(){
        List<Editorial> lista = editorialServicio.findAlleditoriales();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<Editorial> findEditorialNombre(@RequestParam String nombre){
        return new ResponseEntity<>(editorialServicio.findEditorial(nombre), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveAutor(@RequestBody Editorial editorial){
        String txt = editorialServicio.saveEditorial(editorial);
        return new ResponseEntity<>(txt, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateEditorial(@RequestParam Long id, @RequestBody Editorial editorial){
        String txt = editorialServicio.updateEditorial(id, editorial);
        return new ResponseEntity<>(txt, HttpStatus.CREATED);
    }

    @PutMapping("/baja/{id}")
    public ResponseEntity<String> bajaEditorial(@RequestParam Long id){
        String txt = editorialServicio.bajaEditorial(id);
        return new ResponseEntity<>(txt, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEditorial(@RequestParam Long id){
        String txt = editorialServicio.DeleteEditorial(id);
        return new ResponseEntity<>(txt, HttpStatus.OK);
    }
}
