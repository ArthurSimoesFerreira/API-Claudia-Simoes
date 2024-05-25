package com.claudiasimoes.apirestful.service;

import com.claudiasimoes.apirestful.exception.EntidadeDestacadaException;
import com.claudiasimoes.apirestful.exception.EntidadeNaoEncontradaException;
import com.claudiasimoes.apirestful.model.Categoria;
import com.claudiasimoes.apirestful.model.CategoriaDTO;
import com.claudiasimoes.apirestful.model.Produto;
import com.claudiasimoes.apirestful.repository.CategoriaRepository;
import com.claudiasimoes.apirestful.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public Optional<Categoria> recuperarCategoria(Long idCategoria) {
        return categoriaRepository.findById(idCategoria);
    }

    public Categoria recuperarCategoriaComProdutos(Long idCategoria) {
        return categoriaRepository.recuperarCategoriaComProdutosPorIdDaCategoria(idCategoria)
                .orElseThrow(() -> new EntidadeNaoEncontradaException(
                        "Categoria número " + idCategoria + " não encontrada"));
    }
}
