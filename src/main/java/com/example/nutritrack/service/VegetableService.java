package com.example.nutritrack.service;

import com.example.nutritrack.model.Vegetable;
import com.example.nutritrack.repository.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VegetableService {

    private final VegetableRepository vegetableRepository;

    @Autowired
    public VegetableService(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    public List<Vegetable> getAllVegetables() {
        return vegetableRepository.findAll();
    }

    public Vegetable getVegetableById(String id) {
        return vegetableRepository.findById(id).orElse(null);
    }

    public Vegetable saveVegetable(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    public void deleteVegetable(String id) {
        vegetableRepository.deleteById(id);
    }
}
