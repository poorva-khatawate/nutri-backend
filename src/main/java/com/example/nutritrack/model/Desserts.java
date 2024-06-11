package com.example.nutritrack.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "desserts")
public class Desserts {

    @Id
    private String id;
    private String img;
    private String title;
    private int calories;

    public Desserts() {}

    public Desserts(String img, String title, int calories) {
        this.img = img;
        this.title = title;
        this.calories = calories;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
