package com.portfolio.backend.service;

import com.portfolio.backend.model.Estudio;
import com.portfolio.backend.model.Interes;
import java.util.List;


public interface IInteresService {
    public List<Interes> verInteres();
    public Interes verInteres(Long id);
    public void borrarInteres(Long id);
    public void agregarInteres(Interes interes);
    public void modificarInteres (Long id, Interes interes); 
    public List<Interes> verInteresesPorPersonaId(Long idPersona);

}
