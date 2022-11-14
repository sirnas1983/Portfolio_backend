package com.portfolio.backend.controller;

import com.portfolio.backend.model.Experiencia;
import com.portfolio.backend.service.ExperienciaService;
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
    
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return experienciaSer.verExperiencias();
    }
    
    @GetMapping("/ver/experiencia/{id}")
    @ResponseBody
    public Experiencia verEstudio(@PathVariable Long id){
        return experienciaSer.verExperiencia(id);
    }
    
    @PostMapping("/borrar/experiencia/{id}")
    public void borrarEstudio(@PathVariable Long id){
        experienciaSer.borrarExperiencia(id);
    }
    
    @PostMapping("/modificar/experiencia/{id}")
    public void modificarEstudio(@PathVariable Long id, @RequestBody Experiencia experiencia){
        experiencia.setId(id);
        experienciaSer.agregarExperiencia(experiencia);
    }
    
    @PostMapping("/agregar/experiencia")
    public void agregarEstudio(@RequestBody Experiencia experiencia){
        experienciaSer.agregarExperiencia(experiencia);
    }
       
}
