package aula001;

public class Main {
	public static void main(String[] args) {
		Personagem heroi = new Personagem();
		
		heroi.nome = "Hércules";
		heroi.nivel = 4;
		heroi.forca = 20;
		
		heroi.mostrarStatus();
		heroi.atacar("goblin", "soco forte");
	}
}
