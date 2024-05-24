package com.carlosribeiro.apirestful.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imagem;
    private String nome;
    private String descricao;
    private boolean disponivel;
    private int qtdEstoque;
    private BigDecimal preco;
    private LocalDate dataCadastro;

    public Produto(String imagem,
                   String nome,
                   String descricao,
                   boolean disponivel,
                   int qtdEstoque,
                   BigDecimal preco,
                   LocalDate dataCadastro) {
        this.imagem = imagem;
        this.nome = nome;
        this.descricao = descricao;
        this.disponivel = disponivel;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
        this.dataCadastro = dataCadastro;
    }
}
