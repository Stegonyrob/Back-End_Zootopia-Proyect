package com.team_zootopia.backend_zootopia.repositories;

import org.springframework.data.repository.CrudRepository;


import com.team_zootopia.backend_zootopia.models.Animal;

import org.springframework.lang.NonNull;


public interface AnimalRepository extends CrudRepository<Animal, Long> {

    Animal findByName(String animal);

    @Override
    @NonNull
    <S extends Animal> S save(@NonNull S entity);
}