package com.claudiasimoes.apirestful.controller;

import com.claudiasimoes.apirestful.model.Categoria;
import com.claudiasimoes.apirestful.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

    @Autowired       // http://localhost:8080/categorias
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> recuperarCategorias() {
        return categoriaService.recuperarCategorias();
    }

    @PostMapping
    public Categoria cadastrarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.cadastrarCategoria(categoria);
    }

    @PutMapping
    public Categoria alterarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.alterarCategoria(categoria);
    }

    @DeleteMapping ("{idcategoria}")     // http://localhost:8080/categorias/1
    public void removerCategoria(@PathVariable("idCategoria") Long id) {
        categoriaService.removerCategoria(id);
    }
}
