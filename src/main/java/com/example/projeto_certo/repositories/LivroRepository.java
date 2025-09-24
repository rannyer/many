package com.example.projeto_certo.repositories;

import com.example.projeto_certo.models.Autor;
import com.example.projeto_certo.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

    List<Livro> findByAutoresNacionalidadeIgnoreCase(String nacionalidade);

    List<Livro> findByAnoLancamentoGreaterThan(Long ano);
}
