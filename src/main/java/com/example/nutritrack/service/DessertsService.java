package com.example.nutritrack.service;

import com.example.nutritrack.model.Desserts;
import com.example.nutritrack.repository.DessertsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DessertsService {

    private final DessertsRepository dessertsRepository;

    @Autowired
    public DessertsService(DessertsRepository dessertsRepository) {
        this.dessertsRepository = dessertsRepository;
    }

    public List<Desserts> getAllDesserts() {
        return dessertsRepository.findAll();
    }

    public Desserts getDessertsById(String id) {
        return dessertsRepository.findById(id).orElse(null);
    }

    public Desserts saveDesserts(Desserts desserts) {
        return dessertsRepository.save(desserts);
    }

    public void deleteDesserts(String id) {
        dessertsRepository.deleteById(id);
    }
}
