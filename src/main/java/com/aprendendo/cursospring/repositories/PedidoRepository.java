package com.aprendendo.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.cursospring.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
