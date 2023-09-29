package com.example.crud.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class ClienteRequestDto {
    @NotEmpty(message = "É necessário preencher o campo nome")
    private String nome;
}
