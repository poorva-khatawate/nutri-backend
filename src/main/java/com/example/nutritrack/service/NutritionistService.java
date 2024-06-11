package com.example.nutritrack.service;

import com.example.nutritrack.model.Nutritionist;
import com.example.nutritrack.repository.NutritionistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NutritionistService {
    @Autowired
    private NutritionistRepository nutritionistRepository;

    public List<Nutritionist> getAllNutritionists() {
        return nutritionistRepository.findAll();
    }

    public Optional<Nutritionist> getNutritionistById(String id) {
        return nutritionistRepository.findById(id);
    }

    public Nutritionist saveNutritionist(Nutritionist nutritionist) {
        return nutritionistRepository.save(nutritionist);
    }

    public void deleteNutritionist(String id) {
        nutritionistRepository.deleteById(id);
    }
}

