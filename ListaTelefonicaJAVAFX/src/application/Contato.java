package application;

public class Contato {
	private String nome, sobrenome, numeroTelefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() < 32) {
			this.nome = nome;
		}else {
			throw new IllegalArgumentException("Nome excede o limite de caracteres");
		}
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		if(sobrenome.length() < 32) {
			this.sobrenome = sobrenome;
		}else {
			throw new IllegalArgumentException("Nome excede o limite de caracteres");
		}
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	
}
