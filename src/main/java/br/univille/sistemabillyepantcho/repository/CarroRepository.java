package br.univille.sistemabillyepantcho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.sistemabillyepantcho.entity.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro,Long> {
    
}
