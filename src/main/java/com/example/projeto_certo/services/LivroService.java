package com.example.projeto_certo.services;

import com.example.projeto_certo.models.Livro;
import com.example.projeto_certo.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> findAll(){
        return livroRepository.findAll();
    }

    public Livro create(Livro livro){
        return livroRepository.save(livro);
    }
    public List<Livro> findByAutorNaciolidade(String nacionalidade){
        return livroRepository.findByAutoresNacionalidadeIgnoreCase(nacionalidade);
    }
}
