package com.lojaa.first_spring_app.repository;

import com.lojaa.first_spring_app.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}