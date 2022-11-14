package com.portfolio.backend.model;

import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDTO implements Serializable{
    
    private Long id;
    private String nombre;
    private String ocupacion;
    private String descripcion;
    private String foto;
    private String banner;
    private String fechaNacimiento;
    private String whatsapp;
    private String email;
    private String repositorio;
    private String acercademi;
    private String facebook;
    private String instagram;
    private String tweeter;
    private List<Estudio> listaEstudios;
    private List<Conocimiento> listaConocimientos;
    private List<Experiencia> listaExperiencias;
    private List<Idioma> listaIdiomas;
    private List<Interes> listaIntereses;
    private List<Skill> listaSkills;

    public PersonaDTO() {
    }

  
}
