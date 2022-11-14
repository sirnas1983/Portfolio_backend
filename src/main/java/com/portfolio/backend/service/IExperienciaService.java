package com.portfolio.backend.service;

import com.portfolio.backend.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    public List<Experiencia> verExperiencias();
    public Experiencia verExperiencia(Long id);
    public void borrarExperiencia(Long id);
    public void agregarExperiencia(Experiencia experiencia);
    public void modificarExperiencia (Long id, Experiencia experiencia);    
}
