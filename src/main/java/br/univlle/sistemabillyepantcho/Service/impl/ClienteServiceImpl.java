package br.univlle.sistemabillyepantcho.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univlle.sistemabillyepantcho.Service.ClienteService;
import br.univlle.sistemabillyepantcho.entity.Cliente;
import br.univlle.sistemabillyepantcho.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> getAll() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }
   
    

    
}
