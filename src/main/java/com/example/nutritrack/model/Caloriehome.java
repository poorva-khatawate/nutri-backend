package com.example.nutritrack.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "caloriehome")
public class Caloriehome {
    @Id
    private String id;
    private String name;
    private String img;
    public Caloriehome() {
    }
    // Getters and Setters
    public Caloriehome(String id, String name, String img) {
        this.id = id;
        this.name = name;
        this.img = img;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    }

