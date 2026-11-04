package com.sedu2.eschola.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sala {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int cadeiras;
    private int mesas;
    private int alunos;

    public Sala(int id, String nome, int cadeiras, int mesas, int alunos) {
        this.id = id;
        this.nome = nome;
        this.cadeiras = cadeiras;
        this.mesas = mesas;
        this.alunos = alunos;
    }
    public Sala(){}
    public Sala(String nome, int cadeiras, int mesas, int alunos) {
        this.nome = nome;
        this.cadeiras = cadeiras;
        this.mesas = mesas;
        this.alunos = alunos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(int cadeiras) {
        this.cadeiras = cadeiras;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }
}
