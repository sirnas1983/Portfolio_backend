
package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public Persona verPersona(Long id);
    public void modificarPersona(Long id, Persona persona);
    public void agregarPersona(Persona pers);
    public List<Persona> verPersonas();
}
