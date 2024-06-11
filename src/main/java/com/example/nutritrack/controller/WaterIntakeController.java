package com.example.nutritrack.controller;

import com.example.nutritrack.model.WaterIntake;
import com.example.nutritrack.service.WaterIntakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/waterintakes")
public class WaterIntakeController {

    private final WaterIntakeService waterIntakeService;

    @Autowired
    public WaterIntakeController(WaterIntakeService waterIntakeService) {
        this.waterIntakeService = waterIntakeService;
    }

    @GetMapping
    public List<WaterIntake> getAllWaterIntakes() {
        return waterIntakeService.getAllWaterIntakes();
    }

    @GetMapping("/{id}")
    public WaterIntake getWaterIntakeById(@PathVariable String id) {
        return waterIntakeService.getWaterIntakeById(id);
    }

    @PostMapping
    public WaterIntake addWaterIntake(@RequestBody WaterIntake waterIntake) {
        return waterIntakeService.saveWaterIntake(waterIntake);
    }

    @DeleteMapping("/{id}")
    public void deleteWaterIntake(@PathVariable String id) {
        waterIntakeService.deleteWaterIntake(id);
    }
}
