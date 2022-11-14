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
@Table(name="conocimientos")
public class Conocimiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String institucion;
    private String area;
    private String nivel;
    private int duracion;
    private String descripcion;
    
    @ManyToOne()
    @JoinColumn(name="persona_id")
    @JsonIgnore
    private Persona persona;
    

    public Conocimiento(Long id, String nombre, String institucion, String area, String nivel, int duracion, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.institucion = institucion;
        this.area = area;
        this.nivel = nivel;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public Conocimiento() {
    }
   
}
