package com.portfolio.backend.service;

import com.portfolio.backend.model.Interes;
import com.portfolio.backend.repository.InteresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InteresService implements IInteresService{

    @Autowired
    private InteresRepository interesRepo;
    
    @Override
    public List<Interes> verInteres() {
        return interesRepo.findAll();
    }

    @Override
    public Interes verInteres(Long id) {
        return interesRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarInteres(Long id) {
        interesRepo.deleteById(id);
    }

    @Override
    public void agregarInteres(Interes interes) {
        interesRepo.save(interes);
    }

    @Override
    public void modificarInteres(Long id, Interes interes) {
        interes.setId(id);
        interesRepo.save(interes);
    }
    
}
