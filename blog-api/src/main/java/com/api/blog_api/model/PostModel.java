package com.api.blog_api.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "TB_Post")
public class PostModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 70)
    private String autor;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false, length = 100)
    private String titulo;

    @Lob
    @Column(columnDefinition = "TEXT", nullable = false)
    private String texto;

    public PostModel() {

    }

    public PostModel(String autor, String titulo, String texto) {
        this.autor = autor;
        this.titulo = titulo;
        this.texto = texto;
        this.date = LocalDate.now();
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
