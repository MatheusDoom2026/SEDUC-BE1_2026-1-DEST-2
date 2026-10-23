package com.seduc2.crudfy.artistservice;


import com.seduc2.crudfy.entity.Musica;
import com.seduc2.crudfy.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ArtistaService {


    @Autowired
    MusicaRepository musicaRepository;

    public List<Musica> mostraMusicas(){
        List<Musica> lista = new ArrayList<>();
        lista = musicaRepository.findAll();
        return lista;
    }

}




