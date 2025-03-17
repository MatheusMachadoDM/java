package aula004;

public class Pessoa {
	String nome, documento;
	int idade;

	Pessoa(String nome, String documento, int idade){
		this.nome = nome;
		this.documento = documento;
		this.idade = idade;
	}
	
	public void imprimirInfo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Documento: " + this.documento);
		System.out.println("Idade: " + this.idade);
	}
	
}
