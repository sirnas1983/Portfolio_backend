package com.portfolio.backend.service;

import com.portfolio.backend.model.Idioma;
import com.portfolio.backend.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService{

    @Autowired
    private IdiomaRepository idiomaRepo;
    
    @Override
    public List<Idioma> verIdiomas() {
        return idiomaRepo.findAll();
    }

    @Override
    public Idioma verIdioma(Long id) {
        return idiomaRepo.findById(id).orElse(null);
    }

    @Override
    public void borrarIdioma(Long id) {
        idiomaRepo.deleteById(id);
    }

    @Override
    public void agregarIdioma(Idioma idioma) {
        idiomaRepo.save(idioma);
    }

    @Override
    public void modificarIdioma(Long id, Idioma idioma) {
        idioma.setId(id);
        idiomaRepo.save(idioma);
    }

    @Override
    public List<Idioma> verIdiomasPorPersonaId(Long idPersona) {
        return idiomaRepo.findAllByPersonaId(idPersona);
    }
    
}
