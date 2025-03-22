package com.matheus.listatelefonica;

public class Contato {
	private String nome, numeroTelefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String toString() {
		return nome + "--" + numeroTelefone;
	}
	
	
	
}
