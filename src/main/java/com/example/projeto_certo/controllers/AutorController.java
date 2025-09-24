package com.example.projeto_certo.controllers;

import com.example.projeto_certo.models.Autor;
import com.example.projeto_certo.services.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autor")
public class AutorController {
    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping
    public ResponseEntity<List<Autor>> getAll(){
        return ResponseEntity.ok(autorService.findAll());
    }
    @PostMapping
    public ResponseEntity<Autor> add(@RequestBody Autor autor){
        return ResponseEntity.ok(autorService.create(autor));
    }
}
