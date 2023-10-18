package com.example.crud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome", length = 100)
    private String nome;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

}
