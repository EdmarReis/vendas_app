package io.local.edmar.domain.repository;

import io.local.edmar.domain.entity.Cliente;
import io.local.edmar.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Produtos extends JpaRepository<Produto, Integer> {

    @Query(value = " select * from produto c where c.descricao like '%:descricao%' ", nativeQuery = true)
    List<Produto> encontrarPorDescricao(@Param("descricao") String descricao);

    boolean existsByDescricao(String descricao);

    //@Query("select c from Cliente c left join fetch c.pedidos where c.id =:id ")
    //Cliente findClienteFetchPedidos(@Param("id") Integer id);

}
