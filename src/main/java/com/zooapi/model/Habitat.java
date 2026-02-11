package com.zooapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Habitat {
    public Habitat (String nombre, int capacidad, int habitatId){
        this.nombre = nombre;
        this.animales = animales;
        this.capacidad = capacidad;
        this.habitatId = habitatId;

    }

    public int habitatId;
    public String nombre;
    public int capacidad;
    public List<Animal> animales;

}
