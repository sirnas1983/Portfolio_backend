package com.portfolio.backend.controller;

import com.portfolio.backend.model.PersonaDTO;
import com.portfolio.backend.model.Persona;
import com.portfolio.backend.service.PersonaService;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaDTOController {
    
    @Autowired
    private PersonaService personaSer;
        
    @GetMapping("/ver/persona/{personaId}")
    public PersonaDTO verPersonaDTO(@PathVariable Long personaId){
        
        Persona persona = personaSer.verPersona(personaId);
        ModelMapper modelMapper = new ModelMapper();
        PersonaDTO personaDTO = modelMapper.map(persona, PersonaDTO.class);
        
        return personaDTO;
        
    }
    
    @GetMapping("/ver/personas")
    public List<PersonaDTO> verPersonasDTO(){
        
        List<Persona> listaPersonas = personaSer.verPersonas();
        List<PersonaDTO> listaPersonaDTOs = new ArrayList<>();
        
        for (Persona persona : listaPersonas){
        listaPersonaDTOs.add(verPersonaDTO(persona.getId()));
        }
        return listaPersonaDTOs;
    }
    
    @PostMapping("/agregar/persona")
    public void agregarPersona(@RequestBody PersonaDTO personaDto){
        personaDto.setId(Long.valueOf(1));
        
        ModelMapper modelMapper = new ModelMapper();
        Persona persona = modelMapper.map(personaDto, Persona.class);
        Persona personaAux = personaSer.verPersona(Long.valueOf(1));
        persona.setListaConocimientos(personaAux.getListaConocimientos());
        persona.setListaEstudios(personaAux.getListaEstudios());
        persona.setListaExperiencias(personaAux.getListaExperiencias());
        persona.setListaIdiomas(personaAux.getListaIdiomas());
        persona.setListaIntereses(personaAux.getListaIntereses());
        persona.setListaSkills(personaAux.getListaSkills());
        personaSer.agregarPersona(persona);
    }
}
