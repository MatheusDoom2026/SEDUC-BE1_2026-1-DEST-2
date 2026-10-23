package com.seduc2.crudfy.entity;

import jakarta.persistence.*;

@Entity
public class Musica {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(unique = true)
    private String Titulo;
    private String Artista;
    private String Album;
    @Enumerated(EnumType.STRING)
    private String Gênero;
    private String Duração;
    private String Capa;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getGênero() {
        return Gênero;
    }

    public void setGênero(String gênero) {
        Gênero = gênero;
    }

    public String getDuração() {
        return Duração;
    }

    public void setDuração(String duração) {
        Duração = duração;
    }

    public String getCapa() {
        return Capa;
    }

    public void setCapa(String capa) {
        Capa = capa;
    }

    public Musica(int id, String titulo, String artista, String album, String gênero, String duração, String capa) {
        Id = id;
        Titulo = titulo;
        Artista = artista;
        Album = album;
        Gênero = gênero;
        Duração = duração;
        Capa = capa;

    }
}
