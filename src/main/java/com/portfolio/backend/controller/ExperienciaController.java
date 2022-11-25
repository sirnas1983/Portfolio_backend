package com.portfolio.backend.controller;

import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.service.ExperienciaService;
import com.portfolio.backend.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    
    @Autowired
    private ExperienciaService experienciaSer;
    
    @Autowired
    private PersonaService personaSer;
    
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return experienciaSer.verExperiencias();
    }
        
    @GetMapping("/ver/experiencias/persona/{idPersona}")
    public List<Experiencia> verExperienciasPorPersona(@PathVariable Long idPersona){
        return experienciaSer.verExperienciasPorPersonaId(idPersona);
    }
    
    @PostMapping("/borrar/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaSer.borrarExperiencia(id);
    }
    
    @PostMapping("/modificar/experiencia/{id}")
    public void modificarExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia){
        experiencia.setId(id);
        experienciaSer.agregarExperiencia(experiencia);
    }
    
    @PostMapping("/agregar/experiencia/{personaId}")
    public void agregarExperiencia(@RequestBody Experiencia experiencia, @PathVariable Long personaId){
        experiencia.setPersona(personaSer.verPersona(personaId));
        experienciaSer.agregarExperiencia(experiencia);
    }
}
