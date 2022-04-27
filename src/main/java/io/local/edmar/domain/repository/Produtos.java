package io.local.edmar.domain.repository;

import io.local.edmar.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {



}
