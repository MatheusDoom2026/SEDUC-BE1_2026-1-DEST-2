package com.sedu2.eschola.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int idade;
    private int disciplina;
    private int turmas;
    private int cpf;

    public Professor(int id, String nome, int idade, int disciplina, int turmas, int cpf) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.disciplina = disciplina;
        this.turmas = turmas;
        this.cpf = cpf;
    }

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(int disciplina) {
        this.disciplina = disciplina;
    }

    public int getTurmas() {
        return turmas;
    }

    public void setTurmas(int turmas) {
        this.turmas = turmas;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Professor(String nome, int idade, int disciplina, int turmas, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.disciplina = disciplina;
        this.turmas = turmas;
        this.cpf = cpf;


    }

}
