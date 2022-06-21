package br.univille.sistemabillyepantcho.service;

import java.util.List;

import br.univille.sistemabillyepantcho.dto.ClienteDTO;

public interface ClienteService {

    public List<ClienteDTO>getAll();

    public ClienteDTO save(ClienteDTO cliente);

    public ClienteDTO finbyId(long id);
    
    
}
