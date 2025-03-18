package aula002_Modificadores;

public class Item {
	String nome;
	int valor;
	protected boolean usado;
	
	public Item(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
		this.usado = false;
	}
	//Método com modificador de acesso padrão
	void exibirValor() {
		System.out.println("Valor de " + nome + ": " + valor);
	}
	//Método protected
	protected void marcarComoUsado() {
		this.usado = true;
		System.out.println(nome + " marcado como usado");
	}
}
