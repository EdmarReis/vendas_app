package io.local.edmar.domain.repositorio;

import io.local.edmar.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Clientes extends JpaRepository<Cliente, Integer> {

    @Query(value = " select * from cliente c where c.nome like '%:nome%' ", nativeQuery = true)
    List<Cliente> encontrarPorNome(@Param("nome") String nome);

    //@Query(value = " delete from cliente c where c.nome = :nome ")
    //@Modifying
    //void deleteByNome(String nome);

    boolean existsByNome(String nome);



}
