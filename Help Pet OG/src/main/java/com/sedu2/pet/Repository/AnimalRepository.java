package com.sedu2.pet.Repository;


import com.sedu2.pet.Entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    }

