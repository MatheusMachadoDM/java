package aula001_Classes_Objetos_Atributos_Metodos;

public class CarroTestar {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		
		//Objeto == c1, Classe == Carro
		
		//Definindo atributos
		c1.nome = "Onix";
		c1.marca = "Chevrolet";
		c1.ano = 2020;
		c1.velocidade = 80;
		
		//Chamando método
		c1.acelerar(20);
		
		System.out.println("Velocidade após acelerar: " + c1.velocidade);
		
		c1.freiar(30);
		
		System.out.println("Velocidade após freiar: " + c1.velocidade);
		
	}
}
