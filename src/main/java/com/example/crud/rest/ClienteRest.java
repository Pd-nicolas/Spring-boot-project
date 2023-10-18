package com.example.crud.rest;

import com.example.crud.dto.request.ClienteRequestDto;
import com.example.crud.dto.response.ClienteResponseDto;
import com.example.crud.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
@Api(tags = "Clientes")
public class ClienteRest {

    @Autowired
    private ClienteService service;

    @PostMapping
    @ApiOperation("Cadastrar um novo cliente")
    public ResponseEntity<ClienteResponseDto> cadastrarCliente(
            @ApiParam(value = "Dados do cliente a ser cadastrado", required = true)
            @RequestBody ClienteRequestDto clienteRequestDto) {
        // Seu código de cadastro de cliente aqui

        // Retornar a resposta com os dados do cliente cadastrado
        ClienteResponseDto clienteResponseDto = new ClienteResponseDto();
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteResponseDto);
    }
}
