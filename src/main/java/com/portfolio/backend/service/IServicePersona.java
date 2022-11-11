
package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;


public interface IServicePersona {
    
    public Persona verPersona(Long id);
    public void modificarPersona(Long id, Persona persona);
}
