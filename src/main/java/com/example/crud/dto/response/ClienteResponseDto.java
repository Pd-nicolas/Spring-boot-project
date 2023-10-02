package com.example.crud.dto.response;

import com.example.crud.entity.Cliente;
import com.example.crud.entity.Pedido;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.List;
@Getter
@Setter
public class ClienteResponseDto {
    private Long id;
    private String nome;
    private List<Pedido> pedidos;

    public ClienteResponseDto () {

    }

    public static ClienteResponseDto converterEntidadeParaDto(Cliente cliente) {
        ClienteResponseDto response = new ClienteResponseDto();
        BeanUtils.copyProperties(cliente, response);
        response.setId(cliente.getId());
        return response;
    }
}
