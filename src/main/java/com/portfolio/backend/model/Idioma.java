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
@Table(name="idiomas")
public class Idioma {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String idioma;
    private String escrito;
    private String oral;
    private String comprension;
   
    @ManyToOne()
    @JoinColumn(name="persona_id")
    @JsonIgnore
    private Persona persona;
    
    public Idioma() {
    }

    public Idioma(Long id, String idioma, String escrito, String oral, String comprension) {
        this.id = id;
        this.idioma = idioma;
        this.escrito = escrito;
        this.oral = oral;
        this.comprension = comprension;
    }
    
    
}
