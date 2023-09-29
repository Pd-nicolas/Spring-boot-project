package com.example.crud.dto.request;

import com.example.crud.entity.Cliente;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

public class PedidoRequestDto {
    @NotNull(message = "É obrigatório o preenchimento do campo data")
    private Date data;

    @NotNull(message = "É obrigatório o preenchimento do campo total")
    private BigDecimal total;

    @NotEmpty(message = "É obrigatório o preenchimento do campo cliente")
    private Cliente cliente;
}
