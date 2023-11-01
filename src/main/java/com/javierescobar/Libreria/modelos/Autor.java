package com.javierescobar.Libreria.modelos;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private boolean alta;
    @ManyToMany()
    @JoinColumn(name = "fk_libro")
    private Set<Libro> libro;
}
