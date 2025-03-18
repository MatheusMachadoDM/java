package aula005_Interfaces;

public class Cachorro implements IAnimal{//implements faz com que a classe herde a interface

	@Override
	public void fazerSom() {
		System.out.println("Au Au!");
		
	}
	
}
