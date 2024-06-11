package com.example.nutritrack.repository;

import com.example.nutritrack.model.VitaminDef;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitaminDefRepository extends MongoRepository<VitaminDef, String> {
}
