package com.javierescobar.Libreria.modelos;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long isbn;
    @Column
    private String titulo;
    @Column
    private Integer anio;
    @Column
    private Integer ejemplares;
    @Column
    private Integer ejemplaresPrestados;
    @Column
    private Integer ejemplaresRestantes;
    @Column
    private boolean alta;
    @ManyToMany
    @JoinTable(name = "libro_autor")
    private Set<Autor> autor;
    @ManyToOne
    private Editorial editorial;
}
