package com.sedu2.eschola.controllers;


import com.sedu2.eschola.entities.Sala;
import com.sedu2.eschola.services.SalaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static jdk.internal.org.jline.utils.Colors.s;

@RestController
public class SalaController {

    private SalaService service;
    public SalaController(SalaService service) {
        this.service = service;
    }
    @GetMapping
    public List<Sala> mostrarSalas() {
        return service.procurarTodos();

    }

      @PostMapping
      public void criarSala(@RequestBody Sala s){
        service.criarSala(s);


    }
}
