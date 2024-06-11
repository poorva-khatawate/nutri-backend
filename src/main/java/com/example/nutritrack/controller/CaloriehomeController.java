package com.example.nutritrack.controller;

import com.example.nutritrack.model.Caloriehome;
import com.example.nutritrack.service.CaloriehomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/caloriehome")
public class CaloriehomeController {
    @Autowired
    private CaloriehomeService caloriehomeService;

    @GetMapping
    public ResponseEntity<List<Caloriehome>> getAllCaloriehomeItems() {
        return caloriehomeService.getAllCaloriehomeItems();
    }

    @GetMapping("/{id}")
    public Optional<Caloriehome> getCaloriehomeItemById(@PathVariable String id) {
        return caloriehomeService.getCaloriehomeItemById(id);
    }

    @PostMapping
    public Caloriehome createCaloriehomeItem(@RequestBody Caloriehome caloriehome) {
        return caloriehomeService.saveCaloriehomeItem(caloriehome);
    }

    @DeleteMapping("/{id}")
    public void deleteCaloriehomeItem(@PathVariable String id) {
        caloriehomeService.deleteCaloriehomeItem(id);
    }
}
