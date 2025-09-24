package com.example.projeto_certo.services;

import com.example.projeto_certo.models.Autor;
import com.example.projeto_certo.repositories.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> findAll(){
        return autorRepository.findAll();
    }

    public Autor create(Autor autor){
        return autorRepository.save(autor);
    }
}
