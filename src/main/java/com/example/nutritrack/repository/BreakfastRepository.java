package com.example.nutritrack.repository;

import com.example.nutritrack.model.Breakfast;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BreakfastRepository extends MongoRepository<Breakfast, String> {
}
