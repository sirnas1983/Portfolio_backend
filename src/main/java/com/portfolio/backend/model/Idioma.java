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
@Table(name="idiomas")
public class Idioma {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String idioma;
    private String escrito;
    private String oral;
    private String comprension;
    
    private Long personaId;  

    public Idioma() {
    }

    public Idioma(Long id, String idioma, String escrito, String oral, String comprension, Long personaId) {
        this.id = id;
        this.idioma = idioma;
        this.escrito = escrito;
        this.oral = oral;
        this.comprension = comprension;
        this.personaId = personaId;
    }
    
    
}
