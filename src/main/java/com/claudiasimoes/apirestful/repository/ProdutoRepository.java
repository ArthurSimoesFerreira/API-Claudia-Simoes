package com.claudiasimoes.apirestful.repository;

import com.claudiasimoes.apirestful.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
