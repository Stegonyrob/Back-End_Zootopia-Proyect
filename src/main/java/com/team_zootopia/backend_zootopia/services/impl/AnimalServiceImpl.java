package com.team_zootopia.backend_zootopia.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team_zootopia.backend_zootopia.models.Animal;
import com.team_zootopia.backend_zootopia.persistence.IAnimalDAO;
import com.team_zootopia.backend_zootopia.services.IAnimalService;

@Service
public class AnimalServiceImpl implements IAnimalService {
    
    @Autowired
    private IAnimalDAO animalDAO;

    @Override
    public List<Animal> findAll() {
        return animalDAO.findAll();
    }

    @Override
    public Animal findByName(String name) {
        return animalDAO.findByName(name);
    }

    @Override
    public Optional<Animal> findById(Long id) {
       
        return animalDAO.findById(id);
    }
    @Override
    public Animal save(Animal animal) {
        try {
            return animalDAO.save(animal);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Animal update(Animal animal) {
       
        return animalDAO.update(animal);
    }
    }