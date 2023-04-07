package com.schmalfuss;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String animalClass;
    private String lifestyle;
    private String diet;

    public Animal(String name, String animalClass, String lifestyle, String diet) {
        this.name = name;
        this.animalClass = animalClass;
        this.lifestyle = lifestyle;
        this.diet = diet;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }
}
