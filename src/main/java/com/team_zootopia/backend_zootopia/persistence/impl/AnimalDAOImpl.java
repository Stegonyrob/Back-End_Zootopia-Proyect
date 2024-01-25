package com.team_zootopia.backend_zootopia.persistence.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.team_zootopia.backend_zootopia.models.Animal;
import com.team_zootopia.backend_zootopia.persistence.IAnimalDAO;
import com.team_zootopia.backend_zootopia.repositories.AnimalRepository;

import lombok.NonNull;

@Component
public class AnimalDAOImpl implements IAnimalDAO {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> findAll() {
        return (List<Animal>) animalRepository.findAll();
    }

 @Override
@NonNull
public Optional<Animal> findById(Long id){
    Objects.requireNonNull(id, "ID cannot be null");
    return animalRepository.findById(id);
}


    

    @Override
    public Animal findByName(String name) {
        return (Animal) animalRepository.findByName(name);
    }

    @Override
    public Animal save(Animal animal) {
        Objects.requireNonNull(animal, "Animal cannot be null");
        return (Animal) animalRepository.save(animal);
    }

    @Override
    public Animal update(Animal animal) {
        Objects.requireNonNull(animal, "Animal cannot be null");
        return animalRepository.save(animal);
    }
    

   
}
