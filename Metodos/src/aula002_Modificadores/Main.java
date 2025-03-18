package aula002_Modificadores;

public class Main {
	public static void main(String[] args) {
		/*Modificador defini o nivel de acesso do método
		 * 
		 * Tipos de modificadores:
		 * 
		 * --- Modificadores de acesso: ---
		 * 
		 * public: O método pode ser acessado de qualquer lugar, dentro ou fora da classe;
		 * 
		 * private: O método só pode ser acessado dentro da própria classe;
		 * 
		 * protected: O método pode ser acessado na mesma classe, em classes do mesmo pacote e subclasses (classes que herdam);
		 *
		 * padrão ou sem modificar: Pode ser acessador por classes do mesmo pacote; 
		 * 
		 * --- Outros Modificadores:  ---
		 * 
		 * static: Modifica o método para pertencer a classe e ao invés de pertencer ao objeto assim podendo ser instaciado diretamente da classe;
		 * 
		 * final: O método não pode ser sobrescrito por subclasses;
		 * 
		 * abstract: Só existem dentro de classes abstratas, faz com que os métodos não tenham corpo, apenas sejam declarados;
		 * 
		 * --- 	Combinações ---
		 * 
		 * Os modificadores de acesso podem ser combinados com outros, ex:
		 * 
		 * public static
		 * 
		 * protected final
		 * */
		
		Personagem jogador = new Personagem("Herói", 100);
		Personagem inimigo = new Personagem("Goblim", 50);
		
		Item pocao = new Item("Poção de vida", 20);
		
		jogador.atacar(inimigo, 15);
		inimigo.atacar(jogador, 10);
		
		pocao.exibirValor();
        pocao.marcarComoUsado();
        System.out.println("Item " + pocao.nome + " usado: " + pocao.usado);

        Personagem.mensagemJogo("batalha finalizada");
	}
}

