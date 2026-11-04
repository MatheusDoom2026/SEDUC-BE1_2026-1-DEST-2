package com.sedu2.eschola.services;

import com.sedu2.eschola.entities.Professor;
import com.sedu2.eschola.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServices {

    private final ProfessorRepository professorRepository;

    public ProfessorServices(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> procurarTodos() {
        return professorRepository.findAll();
    }

    public void cadastrarProfessor(Professor p) {
        Professor professor = new Professor(p.getNome(),p.getIdade(),p.getDisciplina(),p.getTurmas(),p.getCpf());
        professorRepository.save(professor);
    }
}
