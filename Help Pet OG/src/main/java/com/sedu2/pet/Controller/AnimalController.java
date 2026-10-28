package com.sedu2.pet.Controller;

import com.sedu2.pet.Entity.Animal;
import com.sedu2.pet.Service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animais")

public class AnimalController {

    public AnimalController(AnimalService service) {
        this.service = service;
    }


    AnimalService animalService;

    private final AnimalService service;

    @GetMapping
    public List<Animal> mostrar() {
        return animalService.mostrarAnimais();
    }
        @PostMapping
        public void criarAnimal (@RequestBody Animal a){
            service.cadastrarAnimal(a);
        }
    }