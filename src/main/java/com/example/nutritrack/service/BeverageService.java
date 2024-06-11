package com.example.nutritrack.service;

import com.example.nutritrack.model.Beverage;
import com.example.nutritrack.repository.BeverageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeverageService {
    @Autowired
    private BeverageRepository beverageRepository;

    public List<Beverage> getAllBeverages() {
        return beverageRepository.findAll();
    }

    public Optional<Beverage> getBeverageById(String id) {
        return beverageRepository.findById(id);
    }

    public Beverage saveBeverage(Beverage beverage) {
        return beverageRepository.save(beverage);
    }

    public void deleteBeverage(String id) {
        beverageRepository.deleteById(id);
    }
}
