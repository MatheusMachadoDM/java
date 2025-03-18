package aula003_Tipos_De_Retorno;

public class Calculadora {
	
	//Retorno do tipo inteiro
	int somar(int a, int b) {
		return a + b;
	}
	
	//Retorno do tipo booleano
	boolean ehPar(int numero) {
		return numero % 2 == 0;
	}
	
	//Método sem retorno
	void imprimirMensagem(String mensagem) {
		System.out.println(mensagem);
	}
	
	//Retorno do tipo String
	String retornarMensagem() {
		return "Olá Mundo!";
	}
}
