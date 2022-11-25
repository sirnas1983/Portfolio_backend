package com.portfolio.backend.controller;

import com.portfolio.backend.model.Idioma;
import com.portfolio.backend.service.IdiomaService;
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
public class IdiomaController {
    
    @Autowired
    private IdiomaService idiomaSer;
    
    @Autowired
    private PersonaService personaSer;
    
    @GetMapping("/ver/idiomas")
    @ResponseBody
    public List<Idioma> verIdiomas(){
        return idiomaSer.verIdiomas();
    }
        
    @GetMapping("/ver/idiomas/persona/{idPersona}")
    public List<Idioma> verIdiomasPorPersona(@PathVariable Long idPersona){
        return idiomaSer.verIdiomasPorPersonaId(idPersona);
    }
    
    @PostMapping("/borrar/idioma/{id}")
    public void borrarIdioma(@PathVariable Long id){
        idiomaSer.borrarIdioma(id);
    }
    
    @PostMapping("/modificar/idioma/{id}")
    public void modificarIdioma(@PathVariable Long id, @RequestBody Idioma idioma){
        idioma.setId(id);
        idiomaSer.agregarIdioma(idioma);
    }
    
    @PostMapping("/agregar/idioma/{personaId}")
    public void agregarIdioma(@RequestBody Idioma idioma, @PathVariable Long personaId){
        idioma.setPersona(personaSer.verPersona(personaId));
        idiomaSer.agregarIdioma(idioma);
    }
}
