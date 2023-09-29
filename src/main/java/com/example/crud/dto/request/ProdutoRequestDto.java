package com.example.crud.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class ProdutoRequestDto {
    @NotEmpty(message = "É necessário preencher o campo descricao")
    private String descricao;

    @NotNull(message = "É necessário preencher o campo preco")
    private BigDecimal preco;
}
