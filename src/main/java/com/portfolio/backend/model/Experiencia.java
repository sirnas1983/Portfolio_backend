package com.portfolio.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="experiencias")
public class Experiencia {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String empresa;
    private String tareas;
    private String fechaInicio;
    private String fechaFin;
    private String link;
    private String lugar;
    
    private Long personaId;    

    public Experiencia() {
    }

    public Experiencia(Long id, String nombre, String empresa, String tareas, String fechaInicio, String fechaFin, String link, String lugar, Long personaId) {
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
        this.tareas = tareas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.link = link;
        this.lugar = lugar;
        this.personaId = personaId;
    }
}
