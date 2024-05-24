package com.claudiasimoes.apirestful.service;

import com.claudiasimoes.apirestful.model.Produto;
import com.claudiasimoes.apirestful.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> recuperarProdutos() {
        return produtoRepository.findAll(Sort.by("id"));
    }

    public Produto cadastrarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto alterarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void removerProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
