package com.example.nutritrack.controller;

import com.example.nutritrack.model.Vegetable;
import com.example.nutritrack.service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vegetables")
public class VegetableController {

    private final VegetableService vegetableService;

    @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @GetMapping
    public List<Vegetable> getAllVegetables() {
        return vegetableService.getAllVegetables();
    }

    @GetMapping("/{id}")
    public Vegetable getVegetableById(@PathVariable String id) {
        return vegetableService.getVegetableById(id);
    }

    @PostMapping
    public Vegetable addVegetable(@RequestBody Vegetable vegetable) {
        return vegetableService.saveVegetable(vegetable);
    }

    @DeleteMapping("/{id}")
    public void deleteVegetable(@PathVariable String id) {
        vegetableService.deleteVegetable(id);
    }
}
