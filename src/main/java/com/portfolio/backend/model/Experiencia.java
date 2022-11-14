package com.portfolio.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    
    @ManyToOne()
    @JoinColumn(name="persona_id")
    @JsonIgnore
    private Persona persona;
    
    public Experiencia() {
    }

    public Experiencia(Long id, String nombre, String empresa, String tareas, String fechaInicio, String fechaFin, String link, String lugar) {
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
        this.tareas = tareas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.link = link;
        this.lugar = lugar;
    }
}
