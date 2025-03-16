package aula002_Construtores;

public class Produto {

	//Atributos
	String nome, marca;
	float valor;
	
	//Construtores
	
	/*O construtor tem sempre o mesmo nome da classe e não retorna valor
	 *O construtor é chamado quando instaciamos o objeto usando a palavra reservada new
	 * Quando definimos um construtor com parâmetros, o construtor padrão deixa de existir
	 * */
	
	Produto(){
		
	}
	
	Produto(String nome){
		this.nome = nome;
	}
	
	Produto(String nome, String marca){
		this.nome = nome;
		this.marca = marca;
	}
	
	Produto(String nome, String marca, float valor){
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}
}
