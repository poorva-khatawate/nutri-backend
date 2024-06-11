package com.example.nutritrack.service;

import com.example.nutritrack.model.WaterIntake;
import com.example.nutritrack.repository.WaterIntakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterIntakeService {

    private final WaterIntakeRepository waterIntakeRepository;

    @Autowired
    public WaterIntakeService(WaterIntakeRepository waterIntakeRepository) {
        this.waterIntakeRepository = waterIntakeRepository;
    }

    public List<WaterIntake> getAllWaterIntakes() {
        return waterIntakeRepository.findAll();
    }

    public WaterIntake getWaterIntakeById(String id) {
        return waterIntakeRepository.findById(id).orElse(null);
    }

    public WaterIntake saveWaterIntake(WaterIntake waterIntake) {
        return waterIntakeRepository.save(waterIntake);
    }

    public void deleteWaterIntake(String id) {
        waterIntakeRepository.deleteById(id);
    }
}
