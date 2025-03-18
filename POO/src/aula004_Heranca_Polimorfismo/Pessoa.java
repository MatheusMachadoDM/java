package aula004_Heranca_Polimorfismo;

public class Pessoa { //Classe pai
	String nome, documento;
	int idade;

	Pessoa(String nome, String documento, int idade){ //Construtor
		this.nome = nome;
		this.documento = documento;
		this.idade = idade;
	}
	
	public void imprimirInfo() { //Método
		System.out.println("Nome: " + this.nome);
		System.out.println("Documento: " + this.documento);
		System.out.println("Idade: " + this.idade);
	}
	
}
