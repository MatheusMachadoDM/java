package aula002_Modificadores;

public class Personagem {
	String nome;
	private int vida;
	
	public Personagem(String nome, int vida) {
		this.nome = nome;
		this.vida = vida;
	}
	//Método privado
	private void receberDano(int dano) {
		vida -= dano;
		System.out.println(nome + " recebe " + dano + " de dano. Vida restante: " + vida);
	}
	
	//Método com acesso de pacote (padrão)
    void atacar(Personagem alvo, int dano) {
        System.out.println(nome + " ataca " + alvo.nome + " e causa " + dano + " de dano.");
        alvo.receberDano(dano);
    }

    //Método publico + estático
    public static void mensagemJogo(String mensagem){
        System.out.println("mensagem do jogo:"+ mensagem);
    }
	
}
