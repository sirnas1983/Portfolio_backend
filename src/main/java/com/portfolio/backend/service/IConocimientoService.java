package com.portfolio.backend.service;

import com.portfolio.backend.model.Conocimiento;
import java.util.List;


public interface IConocimientoService {
    
    public List<Conocimiento> verConocimientos();
    public Conocimiento verConocimiento(Long id);
    public void borrarConocimiento(Long id);
    public void agregarConocimiento(Conocimiento conocimiento);
    public void modificarConocimiento (Long id, Conocimiento conocimiento);
    
}
