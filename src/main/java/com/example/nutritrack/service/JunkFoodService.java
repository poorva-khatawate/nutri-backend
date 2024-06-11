package com.example.nutritrack.service;

import com.example.nutritrack.model.JunkFood;
import com.example.nutritrack.repository.JunkFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JunkFoodService {

    private final JunkFoodRepository junkFoodRepository;

    @Autowired
    public JunkFoodService(JunkFoodRepository junkFoodRepository) {
        this.junkFoodRepository = junkFoodRepository;
    }

    public List<JunkFood> getAllJunkFoods() {
        return junkFoodRepository.findAll();
    }

    public JunkFood getJunkFoodById(String id) {
        return junkFoodRepository.findById(id).orElse(null);
    }

    public JunkFood saveJunkFood(JunkFood junkFood) {
        return junkFoodRepository.save(junkFood);
    }

    public void deleteJunkFood(String id) {
        junkFoodRepository.deleteById(id);
    }
}
