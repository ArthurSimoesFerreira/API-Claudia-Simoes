package com.claudiasimoes.apirestful.repository;

import com.claudiasimoes.apirestful.model.Categoria;
import com.claudiasimoes.apirestful.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    @Query("select c from Categoria c left outer join fetch c.produtos where c.id = 1")
    Optional<Categoria> recuperarCategoriaComProdutosPorIdDaCategoria(long id);
}
