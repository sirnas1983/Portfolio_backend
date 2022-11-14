package com.portfolio.backend.service;

import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    private ExperienciaRepository experienciaRepo;
    
    @Override
    public List<Experiencia> verExperiencias() {
        return experienciaRepo.findAll();
    }

    @Override
    public Experiencia verExperiencia(Long id) {
        return experienciaRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }

    @Override
    public void agregarExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }

    @Override
    public void modificarExperiencia(Long id, Experiencia experiencia) {
        experiencia.setId(id);
        agregarExperiencia(experiencia);
    }
    
}
