package com.sedu2.eschola.controllers;

import com.sedu2.eschola.entities.Professor;
import com.sedu2.eschola.services.ProfessorServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class ProfessorController {

    private ProfessorServices professorServices;
    public ProfessorController(ProfessorServices professorServices) {this.professorServices = professorServices;}
    @GetMapping
    public List<Professor> listarProfessores(){
        return professorServices.procurarTodos();

    }

    @PostMapping
    public void cadastrarProfessor(@RequestBody Professor p){
        professorServices.cadastrarProfessor(p);
    }
}
