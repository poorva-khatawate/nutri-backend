package com.example.nutritrack.controller;

import com.example.nutritrack.model.Beverage;
import com.example.nutritrack.service.BeverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/beverages")
public class BeverageController {
    @Autowired
    private BeverageService beverageService;

    @GetMapping
    public List<Beverage> getAllBeverages() {
        return beverageService.getAllBeverages();
    }

    @GetMapping("/{id}")
    public Optional<Beverage> getBeverageById(@PathVariable String id) {
        return beverageService.getBeverageById(id);
    }

    @PostMapping
    public Beverage createBeverage(@RequestBody Beverage beverage) {
        return beverageService.saveBeverage(beverage);
    }

    @DeleteMapping("/{id}")
    public void deleteBeverage(@PathVariable String id) {
        beverageService.deleteBeverage(id);
    }
}

