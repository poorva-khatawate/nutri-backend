package com.example.nutritrack.service;

import com.example.nutritrack.model.Caloriehome;
import com.example.nutritrack.repository.CaloriehomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.List;
import java.util.Optional;

@Service
public class CaloriehomeService {
    @Autowired
    private CaloriehomeRepository caloriehomeRepository;

    public ResponseEntity<List<Caloriehome>> getAllCaloriehomeItems() {
        return new ResponseEntity<> (caloriehomeRepository.findAll(),HttpStatus.OK);
    }

    public Optional<Caloriehome> getCaloriehomeItemById(String id) {
        return caloriehomeRepository.findById(id);
    }

    public Caloriehome saveCaloriehomeItem(Caloriehome caloriehome) {
        return caloriehomeRepository.save(caloriehome);
    }

    public void deleteCaloriehomeItem(String id) {
        caloriehomeRepository.deleteById(id);
    }
}
