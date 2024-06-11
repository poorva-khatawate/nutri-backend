package com.example.nutritrack.controller;

import com.example.nutritrack.model.Nutritionist;
import com.example.nutritrack.service.NutritionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nutritionists")
public class NutritionistController {
    @Autowired
    private NutritionistService nutritionistService;

    @GetMapping
    public List<Nutritionist> getAllNutritionists() {
        return nutritionistService.getAllNutritionists();
    }

    @GetMapping("/{id}")
    public Optional<Nutritionist> getNutritionistById(@PathVariable String id) {
        return nutritionistService.getNutritionistById(id);
    }

    @PostMapping
    public Nutritionist createNutritionist(@RequestBody Nutritionist nutritionist) {
        return nutritionistService.saveNutritionist(nutritionist);
    }

    @DeleteMapping("/{id}")
    public void deleteNutritionist(@PathVariable String id) {
        nutritionistService.deleteNutritionist(id);
    }
}

