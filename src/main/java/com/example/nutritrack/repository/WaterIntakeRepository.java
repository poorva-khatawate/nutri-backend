package com.example.nutritrack.repository;

import com.example.nutritrack.model.WaterIntake;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaterIntakeRepository extends MongoRepository<WaterIntake, String> {
}
