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
@Table(name="skills")
public class Skill {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private Long cantidad;
    private String type;
    
    @ManyToOne()
    @JoinColumn(name="persona_id")
    @JsonIgnore
    private Persona persona;
    
    public Skill() {
    }

    public Skill(Long id, String nombre, Long cantidad, String type) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.type = type;
    }
    
}
