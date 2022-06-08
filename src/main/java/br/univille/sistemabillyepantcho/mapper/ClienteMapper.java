package br.univille.sistemabillyepantcho.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import br.univille.sistemabillyepantcho.dto.ClienteDTO;
import br.univille.sistemabillyepantcho.entity.Cliente;

@Mapper
public interface ClienteMapper {
    List<ClienteDTO>mapCliente(List<Cliente> Cliente);
    List<Cliente> mapClienteDTO(List<ClienteDTO> Cliente);
    ClienteDTO mapCliente(Cliente Cliente);
    Cliente mapClienteDTO(ClienteDTO Cliente);
}
