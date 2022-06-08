package com.david.produtos.repository;

import com.david.produtos.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Produto findById(long id);
}
