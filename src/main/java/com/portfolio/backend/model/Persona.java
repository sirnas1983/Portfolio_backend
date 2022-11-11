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
@Table(name="personas")
public class Persona {
    
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String password;
   private DatosGenerales datoGeneral;

    public Persona(Long id, String password) {
        this.id = id;
        this.password = password;
        this.datoGeneral.setPersonaId(id);
    }
}