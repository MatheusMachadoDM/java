package com.matheus.listatelefonica;

public class Contato {
	private String nome, sobrenome, numeroTelefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() < 33) {
			this.nome = nome;
		}else {
			throw new IllegalArgumentException("Nome ultrapassa o máximo de caracteres");
		}
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if(sobrenome.length() < 33) {
			this.sobrenome = sobrenome;
		}else {
			throw new IllegalArgumentException("Sobrenome ultrapassa o máximo de caracteres");
		}
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	
	
	
}
