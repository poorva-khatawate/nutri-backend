package com.example.nutritrack.repository;

import com.example.nutritrack.model.JunkFood;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JunkFoodRepository extends MongoRepository<JunkFood, String> {
}
