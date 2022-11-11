package com.portfolio.backend.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DTOPersona {
    
    private Long id;
    private DatosGenerales datosGenerales;
    private List<Estudio> listaEstudios;
    private List<Conocimiento> listaConocimientos;
    private List<Experiencia> listaExperiencias;
    private List<Idioma> listaIdiomas;
    private List<Interes> listaIntereses;
    private List<Skill> listaSkills;

    public DTOPersona() {
    }

    public DTOPersona(Long id, DatosGenerales datosGenerales, List<Estudio> listaEstudios, List<Conocimiento> listaConocimientos, List<Experiencia> listaExperiencias, List<Idioma> listaIdiomas, List<Interes> listaIntereses, List<Skill> listaSkills) {
        this.id = id;
        this.datosGenerales = datosGenerales;
        this.listaEstudios = listaEstudios;
        this.listaConocimientos = listaConocimientos;
        this.listaExperiencias = listaExperiencias;
        this.listaIdiomas = listaIdiomas;
        this.listaIntereses = listaIntereses;
        this.listaSkills = listaSkills;
    }
   
}
