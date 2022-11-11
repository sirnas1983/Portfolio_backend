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
@Table(name="estudios")
public class Estudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    private String institucion;
    private String lugar;
    private String nivel;
    private String fechaInicio;
    private String fechaFin;
    private Double promedio;
    private String link;
    private Long personaId;    
    
    public Estudio(Long id, String titulo, String institucion, String lugar, String nivel, String fechaInicio, String fechaFin, Double promedio, String link, Long personaId) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.lugar = lugar;
        this.nivel = nivel;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.promedio = promedio;
        this.link = link;
        this.personaId = personaId;
    }

    public Estudio() {
    }    
}
