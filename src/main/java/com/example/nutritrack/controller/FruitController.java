package com.example.nutritrack.controller;

import com.example.nutritrack.model.Fruit;
import com.example.nutritrack.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fruits")
public class FruitController {

    private final FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping
    public List<Fruit> getAllFruits() {
        return fruitService.getAllFruits();
    }

    @GetMapping("/{id}")
    public Fruit getFruitById(@PathVariable String id) {
        return fruitService.getFruitById(id);
    }

    @PostMapping
    public Fruit addFruit(@RequestBody Fruit fruit) {
        return fruitService.saveFruit(fruit);
    }

    @DeleteMapping("/{id}")
    public void deleteFruit(@PathVariable String id) {
        fruitService.deleteFruit(id);
    }
}
