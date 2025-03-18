package aula005_Interfaces;

public class Gato implements IAnimal {

	@Override
	public void fazerSom() {
		System.out.println("Miau!");
		
	}

	@Override
	public void caminhar() {
		System.out.println("Caminhar discretamente");
		
	}
	
	
}
