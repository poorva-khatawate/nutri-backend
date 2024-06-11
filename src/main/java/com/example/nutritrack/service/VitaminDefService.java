package com.example.nutritrack.service;

import com.example.nutritrack.model.VitaminDef;
import com.example.nutritrack.repository.VitaminDefRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitaminDefService {

    private final VitaminDefRepository vitaminDefRepository;

    @Autowired
    public VitaminDefService(VitaminDefRepository vitaminDefRepository) {
        this.vitaminDefRepository = vitaminDefRepository;
    }

    public List<VitaminDef> getAllVitaminDefs() {
        return vitaminDefRepository.findAll();
    }

    public VitaminDef getVitaminDefById(String id) {
        return vitaminDefRepository.findById(id).orElse(null);
    }

    public VitaminDef saveVitaminDef(VitaminDef vitaminDef) {
        return vitaminDefRepository.save(vitaminDef);
    }

    public void deleteVitaminDef(String id) {
        vitaminDefRepository.deleteById(id);
    }
}
