package com.sedu2.pet.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity

public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String nome;
    private String especie;
    private String raca;
    private String genero;
    private LocalDate datadeNascimento;
    private Double peso;
    private String cor;
    private boolean castrado;
    private String vacinado;
    private String observacoes;

    public Animal() {
    }

    public Animal(String nome, String especie, String raca, String genero, LocalDate datadeNascimento, Double peso, String cor, boolean castrado, String vacinado, String observacoes) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.genero = genero;
        this.datadeNascimento = datadeNascimento;
        this.peso = peso;
        this.cor = cor;
        this.castrado = castrado;
        this.vacinado = vacinado;
        this.observacoes = observacoes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaça(String raca) {
        this.raca = raca;
    }

    public String getGênero() {
        return genero;
    }

    public void setGênero(String genero) {
        this.genero = genero;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(LocalDate datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public String getVacinado() {
        return vacinado;
    }

    public void setVacinado(String vacinado) {
        this.vacinado = vacinado;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Animal(long id, String nome, String especie, String raca, String genero, LocalDate datadeNascimento, Double peso, String cor, boolean castrado, String vacinado, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.genero = genero;
        this.datadeNascimento = datadeNascimento;
        this.peso = peso;
        this.cor = cor;
        this.castrado = castrado;
        this.vacinado = vacinado;
        this.observacoes = observacoes;
    }
}

