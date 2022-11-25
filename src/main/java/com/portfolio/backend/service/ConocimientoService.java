
package com.portfolio.backend.service;

import com.portfolio.backend.model.Conocimiento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.portfolio.backend.repository.ConocimientoRepository;
import org.springframework.stereotype.Service;

@Service
public class ConocimientoService implements IConocimientoService {
    
    @Autowired
    private ConocimientoRepository conocimientoRepo;

    @Override
    public List<Conocimiento> verConocimientos() {
        return conocimientoRepo.findAll();
    }

    
    @Override
    public Conocimiento verConocimiento(Long id) {
        return conocimientoRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarConocimiento(Long id) {
        conocimientoRepo.deleteById(id);
    }

    @Override
    public void agregarConocimiento(Conocimiento conocimiento) {
        conocimientoRepo.save(conocimiento);
    }

    @Override
    public void modificarConocimiento(Long id, Conocimiento conocimiento) {
        conocimiento.setId(id);
        agregarConocimiento(conocimiento);
    }

    @Override
    public List<Conocimiento> verConocimientosPorPersonaId(Long idPersona) {
        return conocimientoRepo.findAllByPersonaId(idPersona);
    }
    
}
