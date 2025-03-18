package aula005_Interfaces;

/*Interface serve como um contrato para as classes
 * especificando métodos mas sem precisar definir a implementação
 * 
 * variaveis só podem sem constantes dentro de interfaces
 * 
 * não podem ser instancidas
 * 
 * Uma classe pode implementar várias interfaces
 * 
 * 
 * */

public interface IAnimal {
	void fazerSom();
	
	//Função default faz com que todas as classes tenham acesso a esta função caso não seja substituida
	default void caminhar() {
		System.out.println("Caminha em quatro patas");
	}
}
