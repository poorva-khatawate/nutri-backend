package com.example.nutritrack.repository;

import com.example.nutritrack.model.Vegetable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VegetableRepository extends MongoRepository<Vegetable, String> {
}
