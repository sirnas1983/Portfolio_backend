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
@Table(name="intereses")
public class Interes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Long personaId;  

    public Interes() {
    }

    public Interes(Long id, String nombre, Long personaId) {
        this.id = id;
        this.nombre = nombre;
        this.personaId = personaId;
    }
    
    
}
