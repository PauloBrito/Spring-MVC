package com.algaworks.cobranca.model;

public enum StatusTitulo {
	PENDENTE("Pendente"), ENVIADO("Enviado"), RECEBIDO("Recebido");

	private String descricao;

	StatusTitulo(String descricao){
	   this.descricao= descricao;
	   
   }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
