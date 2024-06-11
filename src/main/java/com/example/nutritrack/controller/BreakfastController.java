package com.example.nutritrack.controller;

import com.example.nutritrack.model.Breakfast;
import com.example.nutritrack.service.BreakfastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/breakfast")
public class BreakfastController {
    @Autowired
    private BreakfastService breakfastService;

    @GetMapping
    public List<Breakfast> getAllBreakfastItems() {
        return breakfastService.getAllBreakfastItems();
    }

    @GetMapping("/{id}")
    public Optional<Breakfast> getBreakfastItemById(@PathVariable String id) {
        return breakfastService.getBreakfastItemById(id);
    }

    @PostMapping
    public Breakfast createBreakfastItem(@RequestBody Breakfast breakfast) {
        return breakfastService.saveBreakfastItem(breakfast);
    }

    @DeleteMapping("/{id}")
    public void deleteBreakfastItem(@PathVariable String id) {
        breakfastService.deleteBreakfastItem(id);
    }
}
