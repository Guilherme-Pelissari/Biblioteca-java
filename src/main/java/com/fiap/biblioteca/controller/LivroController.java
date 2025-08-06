package com.fiap.biblioteca.controller;

import com.fiap.biblioteca.model.Livro;
import com.fiap.biblioteca.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity<Livro> adicionarLivro(@Valid @RequestBody Livro livro) {
        return ResponseEntity.ok(livroService.adicionarLivro(livro));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(livroService.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<Page<Livro>> listarLivros(Pageable pageable) {
        return ResponseEntity.ok(livroService.listarLivros(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizarLivro(@PathVariable Long id, @Valid @RequestBody Livro livro) {
        return ResponseEntity.ok(livroService.atualizarLivro(id, livro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLivro(@PathVariable Long id) {
        livroService.deletarLivro(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/buscar")
    public ResponseEntity<Page<Livro>> buscarPorTitulo(@RequestParam String titulo, Pageable pageable) {
        return ResponseEntity.ok(livroService.buscarPorTitulo(titulo, pageable));
    }
}