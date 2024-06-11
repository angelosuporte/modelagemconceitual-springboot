package com.aprendendo.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.cursospring.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
