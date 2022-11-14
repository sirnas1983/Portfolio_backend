package com.portfolio.backend.service;


import com.portfolio.backend.model.Idioma;
import java.util.List;


public interface IIdiomaService {
    public List<Idioma> verIdiomas();
    public Idioma verIdioma(Long id);
    public void borrarIdioma(Long id);
    public void agregarIdioma(Idioma idioma);
    public void modificarIdioma (Long id, Idioma idioma);    
}
