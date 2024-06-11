package com.example.nutritrack.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "waterIntakes")
public class WaterIntake {

    @Id
    private String id;
    private String ageRange;
    private String intake;

    public WaterIntake() {}

    public WaterIntake(String ageRange, String intake) {
        this.ageRange = ageRange;
        this.intake = intake;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }
}
