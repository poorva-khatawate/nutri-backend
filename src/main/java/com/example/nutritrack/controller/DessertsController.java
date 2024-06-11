package com.example.nutritrack.controller;

import com.example.nutritrack.model.Desserts;
import com.example.nutritrack.service.DessertsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/desserts")
public class DessertsController {

    private final DessertsService dessertsService;

    @Autowired
    public DessertsController(DessertsService dessertsService) {
        this.dessertsService = dessertsService;
    }

    @GetMapping
    public List<Desserts> getAllDesserts() {
        return dessertsService.getAllDesserts();
    }

    @GetMapping("/{id}")
    public Desserts getDessertsById(@PathVariable String id) {
        return dessertsService.getDessertsById(id);
    }

    @PostMapping
    public Desserts addDesserts(@RequestBody Desserts desserts) {
        return dessertsService.saveDesserts(desserts);
    }

    @DeleteMapping("/{id}")
    public void deleteDesserts(@PathVariable String id) {
        dessertsService.deleteDesserts(id);
    }
}
