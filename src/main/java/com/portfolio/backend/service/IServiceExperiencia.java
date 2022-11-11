package com.portfolio.backend.service;

import com.portfolio.backend.model.Experiencia;
import java.util.List;

public interface IServiceExperiencia {
    public List<Experiencia> verExperiencia();
    public Experiencia verExperiencia(Long id);
    public void borrarExperiencia(Long id);
    public void agregarExperiencia(Experiencia experiencia);
    public void modificarExperiencia (Long id, Experiencia experiencia);    
}
