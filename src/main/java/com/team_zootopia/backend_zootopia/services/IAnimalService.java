package com.team_zootopia.backend_zootopia.services;

import java.util.List;
import java.util.Optional;

import com.team_zootopia.backend_zootopia.models.Animal;

public interface IAnimalService {

  List<Animal> findAll();

  Optional<Animal> findById(Long id);

  Animal findByName(String name);

  Animal save(Animal animal);

  Animal update(Animal animal);

}