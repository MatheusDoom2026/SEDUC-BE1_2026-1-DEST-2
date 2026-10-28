package com.sedu2.pet.Service;

import com.sedu2.pet.Entity.Animal;
import com.sedu2.pet.Repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;


@Service
public class AnimalService {


    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<Animal> mostrarAnimais (){
        List<Animal> animalList = new ArrayList<>();
        return animalList = animalRepository.findAll();

    }

    public void cadastrarAnimal(Animal animation) {
        Animal animal = new Animal();
        animal.setNome(animation.getNome());
        animal.setCastrado(animation.isCastrado());
        animal.setEspecie(animation.getEspecie());
        animal.setRaca(animation.getRaca());
        animal.setGenero(animation.getGenero());
        animal.setDatadeNascimento(animation.getDatadeNascimento());
        animal.setPeso(animation.getPeso());
        animal.setCor(animation.getCor());
        animal.setVacinado(animation.getVacinado());
        animal.setObservacoes(animation.getObservacoes());

        animalRepository.save(animal);

    }

}
