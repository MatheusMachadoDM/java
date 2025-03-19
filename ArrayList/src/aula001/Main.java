package aula001;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//Array(Vetor) = com um tamanho fixo de 5 posições
		String[] vetor = new String[5];
		
		vetor[0] = "Jose";
		vetor[1] = "Maria";
		vetor[2] = "Jorge";
		vetor[3] = "Alex";
		vetor[4] = "Marta";
		
		//ArrayList<Tipo> objeto = new ArrayList<Tipo>();
		//Tipo == integer float double character String
		ArrayList<String> lista = new ArrayList<String>();
		
		//objeto.metodo(argumento definido anteriormente);
		
		lista.add("Joao");//Índice 0
		lista.add("Ana"); 
		lista.add("Carlos");
		lista.add("Igor");
		lista.add("Gabriel");
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println("Índice[" + i + "] do array estático: " + vetor[i]);
		}
		
		System.out.print("\n");
		
		//lista.clear(); Remove todo o conteúdo
		
		for(int i = 0; i < lista.size(); i ++) {
			System.out.println("Índice[" + i + "] do array dinâmico: " + lista.get(i));
		}
		
		lista.remove(1);
		System.out.print("\n");
		
		for(String nome : lista) {
			System.out.println(nome);
		}
	}
}
