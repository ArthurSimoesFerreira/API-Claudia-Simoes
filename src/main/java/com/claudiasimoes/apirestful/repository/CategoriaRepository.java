package com.claudiasimoes.apirestful.repository;

import com.claudiasimoes.apirestful.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
