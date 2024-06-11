package com.example.nutritrack.service;

import com.example.nutritrack.model.Breakfast;
import com.example.nutritrack.repository.BreakfastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BreakfastService {
    @Autowired
    private BreakfastRepository breakfastRepository;

    public List<Breakfast> getAllBreakfastItems() {
        return breakfastRepository.findAll();
    }

    public Optional<Breakfast> getBreakfastItemById(String id) {
        return breakfastRepository.findById(id);
    }

    public Breakfast saveBreakfastItem(Breakfast breakfast) {
        return breakfastRepository.save(breakfast);
    }

    public void deleteBreakfastItem(String id) {
        breakfastRepository.deleteById(id);
    }
}
