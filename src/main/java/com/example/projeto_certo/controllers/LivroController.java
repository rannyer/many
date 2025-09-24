package com.example.projeto_certo.controllers;

import com.example.projeto_certo.models.Livro;
import com.example.projeto_certo.services.LivroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {
    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public ResponseEntity<List<Livro>> getAll(){
        return ResponseEntity.ok(livroService.findAll());
    }
    @PostMapping
    public ResponseEntity<Livro> add(@RequestBody Livro livro){
        return ResponseEntity.ok(livroService.create(livro));
    }
    @GetMapping("/autor/nacionalidade/{nacionalidade}")
    public ResponseEntity<List<Livro>> getByAutorNacion(@PathVariable String nacionalidade){
        return ResponseEntity.ok(livroService.findByAutorNaciolidade(nacionalidade));
    }
}
