package com.schmalfuss;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("tiger", "mammalia", "solitary", "carnivore"));
        animals.add(new Animal("jaguar", "mammalia", "crepuscular", "carnivore"));
        animals.add(new Animal("puma", "mammalia", "crepuscular", "carnivore"));
        animals.add(new Animal("vampire bat", "mammalia", "nocturnal", "carnivore"));
        animals.add(new Animal("tortoise", "reptilia", "solitary", "herbivore"));
        animals.add(new Animal("crocodile", "reptilia", "nocturnal", "carnivore"));
        animals.add(new Animal("squirrel", "mammalia", "solitary", "omnivore"));
        animals.add(new Animal("camel", "mammalia", "diurnal", "herbivore"));
        animals.add(new Animal("beaver", "mammalia", "diurnal", "herbivore"));
        animals.add(new Animal("mouse", "mammalia", "solitary", "herbivore"));
        animals.add(new Animal("chimpanzee", "mammalia", "diurnal", "omnivore"));

        //all omnivores
        List<Animal> omnivores = animals
                .stream()
                .filter(animal -> animal.getDiet().equals("omnivore"))
                .toList();

        System.out.println("\nLista de todos os animais onívoros e seu respectivo estilo de vida:");
        omnivores.forEach(animal -> System.out.println(animal.getName() + ": " + animal.getLifestyle()));

        //all animals solitaries
        List<Animal> solitaries = animals
                .stream()
                .filter(animal -> animal.getLifestyle().equals("solitary"))
                .toList();

        System.out.println("\nLista de todos os animais solitários e suas respectivas dietas:");
        solitaries.forEach(animal -> System.out.println(animal.getName() + ": " + animal.getDiet()));

        //all diurnal and herbivore
        List<Animal> diurnalHerbivores = animals
                .stream()
                .filter(animal -> animal.getLifestyle().equals("diurnal") && animal.getDiet().equals("herbivore"))
                .toList();

        System.out.println("\nLista de todos os animais diurnos e herbívoro e sua respectiva classe:");
        diurnalHerbivores.forEach(animal -> System.out.println(animal.getName() + ": " + animal.getAnimalClass()));

        //count all mammals
        Long mammalsCount = animals
                .stream().filter(animal -> animal.getAnimalClass().equals("mammalia"))
                .count();

        System.out.println("\nTotal de mamíferos: " + mammalsCount);
    }
}