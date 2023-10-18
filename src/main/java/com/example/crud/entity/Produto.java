package com.example.crud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "produto")
@Getter
@Setter
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "descricao", length = 100)
    private String descricao;

    @Column(name = "preco_unitario")
    private BigDecimal preco;

    @OneToMany(mappedBy = "produto")
    private List<ItemPedido> itemPedidos;
}
