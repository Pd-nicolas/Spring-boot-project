package com.example.crud.dto.response;

import com.example.crud.entity.ItemPedido;
import com.example.crud.entity.Pedido;
import com.example.crud.entity.Produto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ItemPedidoResponseDto {
    private long id;
    private Integer quantidade;
    private List<Pedido> pedidos;
    private List<Produto> produtos;

    public ItemPedidoResponseDto () {

    }

    public static ItemPedidoResponseDto converterEntidadeParaDto(ItemPedido itemPedido) {
        ItemPedidoResponseDto response = new ItemPedidoResponseDto();
        response.setId(itemPedido.getId());
        response.setQuantidade(itemPedido.getQuantidade());

        return response;
    }
}
