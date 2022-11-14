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
@Table(name="intereses")
public class Interes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne()
    @JoinColumn(name="persona_id")
    @JsonIgnore
    private Persona persona;    
    
    public Interes() {
    }

    public Interes(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    
}
