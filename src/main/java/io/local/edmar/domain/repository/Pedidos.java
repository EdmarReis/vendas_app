package io.local.edmar.domain.repository;

import io.local.edmar.domain.entity.Cliente;
import io.local.edmar.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);

}
