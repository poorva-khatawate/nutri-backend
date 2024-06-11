package com.example.nutritrack.controller;

import com.example.nutritrack.model.JunkFood;
import com.example.nutritrack.service.JunkFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/junkfoods")
public class JunkFoodController {

    private final JunkFoodService junkFoodService;

    @Autowired
    public JunkFoodController(JunkFoodService junkFoodService) {
        this.junkFoodService = junkFoodService;
    }

    @GetMapping
    public List<JunkFood> getAllJunkFoods() {
        return junkFoodService.getAllJunkFoods();
    }

    @GetMapping("/{id}")
    public JunkFood getJunkFoodById(@PathVariable String id) {
        return junkFoodService.getJunkFoodById(id);
    }

    @PostMapping
    public JunkFood addJunkFood(@RequestBody JunkFood junkFood) {
        return junkFoodService.saveJunkFood(junkFood);
    }

    @DeleteMapping("/{id}")
    public void deleteJunkFood(@PathVariable String id) {
        junkFoodService.deleteJunkFood(id);
    }
}
