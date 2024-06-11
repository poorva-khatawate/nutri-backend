package com.example.nutritrack.controller;

import com.example.nutritrack.model.VitaminDef;
import com.example.nutritrack.service.VitaminDefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vitamindefs")
public class VitaminDefController {

    private final VitaminDefService vitaminDefService;

    @Autowired
    public VitaminDefController(VitaminDefService vitaminDefService) {
        this.vitaminDefService = vitaminDefService;
    }

    @GetMapping
    public List<VitaminDef> getAllVitaminDefs() {
        return vitaminDefService.getAllVitaminDefs();
    }

    @GetMapping("/{id}")
    public VitaminDef getVitaminDefById(@PathVariable String id) {
        return vitaminDefService.getVitaminDefById(id);
    }

    @PostMapping
    public VitaminDef addVitaminDef(@RequestBody VitaminDef vitaminDef) {
        return vitaminDefService.saveVitaminDef(vitaminDef);
    }

    @DeleteMapping("/{id}")
    public void deleteVitaminDef(@PathVariable String id) {
        vitaminDefService.deleteVitaminDef(id);
    }
}
