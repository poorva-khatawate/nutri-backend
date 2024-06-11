package com.example.nutritrack.repository;

import com.example.nutritrack.model.Nutritionist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NutritionistRepository extends MongoRepository<Nutritionist, String> {
}

