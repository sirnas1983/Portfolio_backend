package com.portfolio.backend.controller;

import com.portfolio.backend.model.PersonaDTO;
import com.portfolio.backend.model.Persona;
import com.portfolio.backend.service.PersonaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaDTOController {
    
    @Autowired
    PersonaService personaSer;
        
    @GetMapping("/ver/persona/dto/{personaId}")
    public PersonaDTO verPersonaDTO(@PathVariable Long personaId){
        
        Persona persona = personaSer.verPersona(personaId);
        var modelMapper = new ModelMapper();
        PersonaDTO personaDTO = modelMapper.map(persona, PersonaDTO.class);
        
        return personaDTO;
        
    }
}
