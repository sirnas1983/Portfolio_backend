
package com.portfolio.backend.service;

import com.portfolio.backend.model.Conocimiento;
import com.portfolio.backend.repository.RepositoryConocimiento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class ServiceConocimiento implements IServiceConocimiento {
    
    @Autowired
    private RepositoryConocimiento repoCono;

    @Override
    public List<Conocimiento> verConocimientos() {
        return repoCono.findAll();
    }

    @Override
    public Conocimiento verConocimiento(Long id) {
        return repoCono.findById(id).orElse(null);
    }

    @Override
    public void borrarConocimiento(Long id) {
        repoCono.deleteById(id);
    }

    @Override
    public void agregarConocimiento(Conocimiento conocimiento) {
        repoCono.save(conocimiento);
    }

    @Override
    public void modificarConocimiento(Long id, Conocimiento conocimiento) {
        conocimiento.setId(id);
        repoCono.save(conocimiento);
    }
    
}
