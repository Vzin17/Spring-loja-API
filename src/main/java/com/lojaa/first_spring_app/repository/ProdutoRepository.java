package com.lojaa.first_spring_app.repository;

import com.lojaa.first_spring_app.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}