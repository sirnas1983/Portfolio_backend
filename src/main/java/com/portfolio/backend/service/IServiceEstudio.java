package com.portfolio.backend.service;


import com.portfolio.backend.model.Estudio;
import java.util.List;

public interface IServiceEstudio {
    public List<Estudio> verEstudios();
    public Estudio verEstudio(Long id);
    public void borrarEstudio(Long id);
    public void agregarEstudio(Estudio estudio);
    public void modificarEstudio (Long id, Estudio estudio);
}
