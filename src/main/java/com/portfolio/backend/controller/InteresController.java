package com.portfolio.backend.controller;

import com.portfolio.backend.model.Interes;
import com.portfolio.backend.service.InteresService;
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
public class InteresController {
    
    @Autowired 
    private InteresService interesSer;
    
    @Autowired
    private PersonaService personaSer;
    
    @GetMapping("/ver/intereses")
    @ResponseBody
    public List<Interes> verIntereses(){
        return interesSer.verInteres();
    }
        
    @GetMapping("/ver/intereses/persona/{idPersona}")
    public List<Interes> verInteresesPorPersona(@PathVariable Long idPersona){
        return interesSer.verInteresesPorPersonaId(idPersona);
    }
    
    @PostMapping("/borrar/interes/{id}")
    public void borrarInteres(@PathVariable Long id){
        interesSer.borrarInteres(id);
    }
    
    @PostMapping("/modificar/interes/{id}")
    public void modificarInteres(@PathVariable Long id, @RequestBody Interes interes){
        interes.setId(id);
        interesSer.agregarInteres(interes);
    }
    
    @PostMapping("/agregar/interes/{personaId}")
    public void agregarInteres(@RequestBody Interes interes, @PathVariable Long personaId){
        interes.setPersona(personaSer.verPersona(personaId));
        interesSer.agregarInteres(interes);
    }
}
