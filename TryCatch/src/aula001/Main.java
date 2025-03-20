package aula001;

public class Main {
	public static void main(String[] args) {
		
		int[] vetor = new int[] {10, 20, 30, 100};
		int[] peso = new int[] {2, 0, 4}; 
	
		for(int i = 0; i < 4; i++) {
			
			//Exception(default) -> ArithmeticException, ArrayIndexOutOfBoundsException, ...
			try {
				
				int resultado = vetor[i] / peso[i];
				System.out.printf("%d / %d = %d\n", vetor[i], peso[i], resultado);
				
				/*
				System.out.println("Mensagem antes da exceção");
				System.out.println(vetor[5]);
				System.out.println("Mensagem após exceção"); //Não roda pois a operação para ao dar erro
				*/
			
			//catch <classe da exceção> <nome(variavel)>
			/*catch(Exception erro) {
				
				//System.out.println("erro da exceção: " + erro.getMessage());
				erro.printStackTrace();
			}*/
			}catch(ArithmeticException erro) {
				System.out.println("Erro do tipo arítmetico");
			}catch(ArrayIndexOutOfBoundsException erro) {
				System.out.println("Erro de vetor");
			}catch(Exception erro) {
				
			}
		}
		System.out.println("Mensagem final");
		
	}
}
