package com.example.crud.dto.request;

import com.example.crud.entity.Pedido;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotEmpty;

@ApiModel(description = "DTO para criar um cliente")
public class ClienteRequestDto {

    @NotEmpty(message = "É obrigatório o preenchimento do campo nome")
    @ApiModelProperty(example = "João da Silva")
    private String nome;

    @ApiModelProperty(example = "example@example.com")
    private String email;

//    @NotEmpty(message = "é obrigatorio preencher o campo produto")
//    private List<Pedido> pedidos;
}
