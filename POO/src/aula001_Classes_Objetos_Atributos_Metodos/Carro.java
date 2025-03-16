package aula001_Classes_Objetos_Atributos_Metodos;

public class Carro {
	//Atributos
	String nome;
	String marca;
	int ano;
	int velocidade;
	
	//Métodos
	void acelerar(/*Parâmetro*/ int aceleracao) {
		velocidade += aceleracao;
	}
	
	void freiar(int reduzir) {
		velocidade -= reduzir;
	}
	
	void buzinar() {
		System.out.println("Buzina!");
	}
}
