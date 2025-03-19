package aula001;

public class Main {
	public static void main(String[] args) {
		
		int[] vetor = new int[] {10, 20, 30};

		
	
		try {
			
			System.out.println(vetor[5]);
			
		}catch(Exception erro) {
			
			System.out.println(erro.getMessage());
			
		}
		
		
		
	}
}
