package com.example.crud.service;

import com.example.crud.dto.request.ClienteRequestDto;
import com.example.crud.dto.response.ClienteResponseDto;
import com.example.crud.entity.Cliente;
import com.example.crud.repository.ClienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
     private ClienteRepository repository;

    public ClienteResponseDto salvar(ClienteRequestDto dto) {
        Cliente cliente = new Cliente();
        BeanUtils.copyProperties(dto, cliente);
        repository.save(cliente);
        return ClienteResponseDto.converterEntidadeParaDto(cliente);
    }


}
