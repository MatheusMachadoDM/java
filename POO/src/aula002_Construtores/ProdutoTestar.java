package aula002_Construtores;

public class ProdutoTestar {
	
	public static void main(String[] args) {
	//Construtor padrão
	Produto p1 = new Produto(); 
	
	p1.nome = "Caneta Preta";
	p1.marca = "Faber";
	p1.valor = 1.50f;

	
	//Construtor de dois parâmetros
	Produto p2 = new Produto("Caneta vermelha", "BIC");
	p2.valor = 1.69f;
	
	
	//Construtor de três parãmetros
	Produto p3 = new Produto("Borracha", "Mercur", 1.89f);
	
	System.out.println("Produto p1: " + p1.nome + " " + p1.marca + " " + p1.valor);
	System.out.println("Produto p2: " + p2.nome + " " + p2.marca + " " + p2.valor);
	System.out.println("Produto p3: " + p3.nome + " " + p3.marca + " " + p3.valor);
	}
}
