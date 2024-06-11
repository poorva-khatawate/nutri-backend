package com.example.nutritrack.repository;

import com.example.nutritrack.model.Caloriehome;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CaloriehomeRepository extends MongoRepository<Caloriehome, String> {
}
