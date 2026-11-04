package com.sedu2.eschola.services;

import com.sedu2.eschola.entities.Sala;
import com.sedu2.eschola.repositories.SalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class SalaService {

        private final SalaRepository salaRepository;

        public SalaService(SalaRepository salaRepository) {
            this.salaRepository = salaRepository;
        }

        public List<Sala> procurarTodos() {
            return salaRepository.findAll();

        }

        public void criarSala(Sala s){
            Sala sala = new Sala(s.getNome(),s.getCadeiras(),s.getMesas(),s.getAlunos());
            salaRepository.save(sala);

        }


}
