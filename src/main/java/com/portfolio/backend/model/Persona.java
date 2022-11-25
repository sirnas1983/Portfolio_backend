package com.portfolio.backend.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    private String nombre;
    private String ocupacion;
    private String descripcion;
    private String foto;
    private String banner;
    private String fechaNacimiento;
    private String whatsapp;
    private String email;
    private String repositorio;
    @Column(length=800)
    private String acercademi;
    private String facebook;
    private String instagram;
    private String tweeter;
    
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Estudio> listaEstudios;
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Conocimiento> listaConocimientos;
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Experiencia> listaExperiencias;
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Idioma> listaIdiomas;
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Interes> listaIntereses;
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Skill> listaSkills;

    public Persona() {
    }

    public Persona(Long id, String nombre, String ocupacion, String descripcion, String foto, String banner, String fechaNacimiento, String whatsapp, String email, String repositorio, String acercademi, String facebook, String instagram, String tweeter) {
        this.id = id;
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