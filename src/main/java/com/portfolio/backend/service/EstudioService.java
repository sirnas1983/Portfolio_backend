
package com.portfolio.backend.service;

import com.portfolio.backend.model.Estudio;
import com.portfolio.backend.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService{

    @Autowired
    private EstudioRepository estudioRepo;
    
    @Override
    public List<Estudio> verEstudios() {
        return estudioRepo.findAll();
    }

    @Override
    public Estudio verEstudio(Long id) {
        return estudioRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarEstudio(Long id) {
        estudioRepo.deleteById(id);
    }

    @Override
    public void agregarEstudio(Estudio estudio) {
        estudioRepo.save(estudio);
    }

    @Override
    public void modificarEstudio(Long id, Estudio estudio) {
        estudio.setId(id);
        agregarEstudio(estudio);
    }
    
    @Override
    public List<Estudio> verEstudiosPorPersonaId(Long idPersona ){
        return estudioRepo.findAllByPersonaId(idPersona);
    }

}
