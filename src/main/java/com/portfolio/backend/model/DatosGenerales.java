package com.portfolio.backend.model;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="general")
public class DatosGenerales implements Serializable {
    
    @Id
    private Long personaId;
    
    private String nombre;
    private String ocupacion;
    private String descripcion;
    private String foto;
    private String banner;
    private String fechaNacimiento;
    private String whatsapp;
    private String email;
    private String repositorio;
    private String acercademi;
    private String facebook;
    private String instagram;
    private String tweeter;
        
    public DatosGenerales() {
    }

    public DatosGenerales(Long personaId, String nombre, String ocupacion, String descripcion, String foto, String banner, String fechaNacimiento, String whatsapp, String email, String repositorio, String acercademi, String facebook, String instagram, String tweeter) {
        this.personaId = personaId;
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.descripcion = descripcion;
        this.foto = foto;
        this.banner = banner;
        this.fechaNacimiento = fechaNacimiento;
        this.whatsapp = whatsapp;
        this.email = email;
        this.repositorio = repositorio;
        this.acercademi = acercademi;
        this.facebook = facebook;
        this.instagram = instagram;
        this.tweeter = tweeter;
    }
   
}
