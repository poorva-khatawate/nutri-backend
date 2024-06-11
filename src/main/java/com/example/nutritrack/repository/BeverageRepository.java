package com.example.nutritrack.repository;

import com.example.nutritrack.model.Beverage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BeverageRepository extends MongoRepository<Beverage, String> {
}

