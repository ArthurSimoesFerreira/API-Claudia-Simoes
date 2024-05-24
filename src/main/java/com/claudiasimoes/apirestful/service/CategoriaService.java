package com.claudiasimoes.apirestful.service;

import com.claudiasimoes.apirestful.model.Categoria;
import com.claudiasimoes.apirestful.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> recuperarCategorias() {
        return categoriaRepository.findAll(Sort.by("id"));
    }

    public Categoria cadastrarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria alterarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void removerCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}
