package com.fiap.biblioteca.service;

import com.fiap.biblioteca.exception.LivroNaoEncontradoException;
import com.fiap.biblioteca.model.Livro;
import com.fiap.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public Livro adicionarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro buscarPorId(Long id) {
        return livroRepository.findById(id).orElseThrow(() -> new LivroNaoEncontradoException("Livro não encontrado"));
    }

    public Page<Livro> listarLivros(Pageable pageable) {
        return livroRepository.findAll(pageable);
    }

    public Livro atualizarLivro(Long id, Livro livroAtualizado) {
        Livro livro = buscarPorId(id);
        livro.setTitulo(livroAtualizado.getTitulo());
        livro.setAutor(livroAtualizado.getAutor());
        livro.setAnoPublicacao(livroAtualizado.getAnoPublicacao());
        livro.setIsbn(livroAtualizado.getIsbn());
        livro.setDisponivel(livroAtualizado.getDisponivel());
        return livroRepository.save(livro);
    }

    public void deletarLivro(Long id) {
        Livro livro = buscarPorId(id);
        livroRepository.delete(livro);
    }

    public Page<Livro> buscarPorTitulo(String titulo, Pageable pageable) {
        return livroRepository.findByTituloContaining(titulo, pageable);
    }
}