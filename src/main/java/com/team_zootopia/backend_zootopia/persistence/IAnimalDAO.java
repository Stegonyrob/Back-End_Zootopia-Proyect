package com.team_zootopia.backend_zootopia.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.team_zootopia.backend_zootopia.models.Animal;

@Component
public interface IAnimalDAO {
    List<Animal> findAll();
    
    Optional<Animal> findById(Long id);
    
    
    Animal findByName(String name);

    Animal save(Animal animal);

    Animal update(Animal animal);
} 