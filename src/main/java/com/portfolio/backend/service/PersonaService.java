package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository personaRepo;
    
    @Override
    public Persona verPersona(Long id) {
        return personaRepo.findById(id).orElse(new Persona());
    }

    @Override
    public void modificarPersona(Long id, Persona persona) {
        persona.setId(id);
        personaRepo.save(persona);
    }

    @Override
    public void agregarPersona(Persona pers) {
        personaRepo.save(pers);
    }

    @Override
    public List<Persona> verPersonas() {
        return personaRepo.findAll();
    }
    
    
    
}
