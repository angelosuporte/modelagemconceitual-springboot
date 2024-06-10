package com.aprendendo.cursospring.domain.enums;

public enum StatusPagamento {

	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private StatusPagamento(int cod, String descrição) {
		this.cod = cod;
		this.descricao = descrição;
	}

	public int getCod() {
		return cod;
	}

	public String getDescrição() {
		return descricao;
	}

	public static StatusPagamento toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(StatusPagamento x : StatusPagamento.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
