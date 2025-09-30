package com.cti.cadastro_usuario.infrastructure.entitys;

import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String autor;
    private String editora;
    private String genero;

    public Livro() {}

    public Livro(String nome, String autor, String editora, String genero) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; } // 🔥 faltava esse

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getEditora() { return editora; }
    public void setEditora(String editora) { this.editora = editora; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
}
