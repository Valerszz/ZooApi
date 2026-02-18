package com.zooapi.servicio;

import com.zooapi.model.Habitat;
import com.zooapi.repositorio.HabitatRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitatServicio {
    private final HabitatRepositorio habitatRepositorio;

    public HabitatServicio(HabitatRepositorio habitatRepositorio){
        this.habitatRepositorio = new HabitatRepositorio();
    }
    public List<Habitat> obtenerHabitats(){
        return habitatRepositorio.obtenerHabitats();
    }
//pojos

}

//en esta capa llama al repositorio, y el controlador llama a esta capa de servicio
// - > logica de negocio que se obtinene de los requerimientos

// la capa de controlador recibe las peticiones http, y llega a modelar --> procesa y valida