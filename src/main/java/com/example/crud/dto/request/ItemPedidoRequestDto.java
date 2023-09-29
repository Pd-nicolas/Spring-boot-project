package com.example.crud.dto.request;

import com.example.crud.entity.Pedido;
import com.example.crud.entity.Produto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class ItemPedidoRequestDto {
    @NotNull(message = "É obrigatório o preenchimento do campo quantidade")
    private Integer quantidade;

    @NotEmpty(message = "É obrigatório o preenchimento do campo pedido")
    private Pedido pedido;

    @NotEmpty(message = "É obrigatório o preenchimento do campo pedido")
    private Produto produto;
}
