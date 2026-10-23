package com.seduc2.crudfy.service;

import com.seduc2.crudfy.entity.Musica;
import com.seduc2.crudfy.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicaService {
    @Autowired
    MusicaRepository musicaRepository;

    public List<Musica> mostraMusicas(){
        List<Musica> lista = new ArrayList<>();
        lista = musicaRepository.findAll();
        return lista;
    }

}
