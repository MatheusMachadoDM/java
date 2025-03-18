package aula003_Tipos_De_Retorno;

import java.lang.reflect.Array;

public class Main {
	
	/*O tipo de retorno especifica o tipo de dado que o método vai retornar após ser chamado
	 * 
	 * ---	Tipos Primitivos	---
	 * 
	 * int, float, double, char
	 * 
	 * ---	Tipos de referência	---
	 * 
	 * String, classes personalizadas. Arrays
	 * 
	 * ---	Void	---
	 * 
	 * Especifica que o método não retornara nenhum valor
	 * */
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		int resultadoSoma = calc.somar(10, 10);
		
		boolean numeroPar = calc.ehPar(2);
		
		calc.imprimirMensagem("Hello World!");
		
		String mensagem = calc.retornarMensagem();
		
		System.out.println(resultadoSoma);
		System.out.println(numeroPar);
		System.out.println(mensagem);
	}
}
