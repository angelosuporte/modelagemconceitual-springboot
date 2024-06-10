package com.aprendendo.cursospring.domain;

import java.io.Serializable;
import java.util.Objects;

import com.aprendendo.cursospring.domain.enums.StatusPagamento;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

@Entity
public class Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	private StatusPagamento status;

	@OneToOne
	@JoinColumn(name="pedido_id")
	@MapsId //Garante que o id do Pagamento seja o mesmo do Pedido
	private Pedido pedido;

	private PagamentoComBoleto pagamentoComBoleto;

	private PagamentoComCartao pagamentoComCartao;

	public Pagamento() {
	}

	public Pagamento(Integer id, StatusPagamento status, Pedido pedido) {
		super();
		this.id = id;
		this.status = status;
		this.setPedido(pedido);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StatusPagamento getStatusPagamento() {
		return status;
	}

	public void setStatusPagamento(StatusPagamento status) {
		this.status = status;
	}

	public PagamentoComBoleto getPagamentoComBoleto() {
		return pagamentoComBoleto;
	}

	public void setPagamentoComBoleto(PagamentoComBoleto pagamentoComBoleto) {
		this.pagamentoComBoleto = pagamentoComBoleto;
	}

	public PagamentoComCartao getPagamentoComCartao() {
		return pagamentoComCartao;
	}

	public void setPagamentoComCartao(PagamentoComCartao pagamentoComCartao) {
		this.pagamentoComCartao = pagamentoComCartao;
	}
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		return Objects.equals(id, other.id);
	}

}
