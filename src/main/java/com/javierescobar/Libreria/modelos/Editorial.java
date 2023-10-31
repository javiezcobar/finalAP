package com.javierescobar.Libreria.modelos;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@Table(name = "editoriales")
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany()
    @JoinColumn(name = "fk_libros")
    private Set<Libro> libro;
    @Column
    private String nombre;
    @Column
    private boolean alta;
}
