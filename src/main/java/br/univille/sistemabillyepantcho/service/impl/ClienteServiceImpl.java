package br.univille.sistemabillyepantcho.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.sistemabillyepantcho.entity.Cliente;
import br.univille.sistemabillyepantcho.repository.ClienteRepository;
import br.univille.sistemabillyepantcho.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }
    
}
