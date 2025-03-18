package aula001;

public class Personagem {
	String nome;
	int nivel, forca;
	
	/*Métodos são blocos de código que executam alguma tarefa, declaração de um método:
	 * 
	 * <modificador> <tipo de retorno> <nomeMetodo>(<parametros>){
	  
		corpo do método
		return <valor do retorno> *opcional
	}
	 */
	
	void mostrarStatus() {
		System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
	}
	
	void atacar(String alvo, String habilidade) {
		System.out.format("%s atacou %s com %s e causou %d de dano!", nome, alvo, habilidade, forca);
	}
}
