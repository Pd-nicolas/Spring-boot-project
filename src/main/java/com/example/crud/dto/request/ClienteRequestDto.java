package com.example.crud.dto.request;

import jakarta.validation.constraints.NotEmpty;

public class ClienteRequestDto {

    @NotEmpty(message = "É obrigatório o preenchimento do campo nome")
    private String nome;
}
