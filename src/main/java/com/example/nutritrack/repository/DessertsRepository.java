package com.example.nutritrack.repository;

import com.example.nutritrack.model.Desserts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DessertsRepository extends MongoRepository<Desserts, String> {
}
