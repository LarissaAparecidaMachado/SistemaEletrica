package br.univlle.sistemabillyepantcho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univlle.sistemabillyepantcho.entity.Cliente;
@Repository

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    
}
