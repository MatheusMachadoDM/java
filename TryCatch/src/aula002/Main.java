package aula002;

public class Main {
	public static void main(String args[]) {
		
		
		try {
			System.out.println("Mensagem antes da exceção");
			int resultado = 10 / 0;
			System.out.println("Mensagem após exceção");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//Sempre é executado 
			System.out.println("Sou executado independente se tem exceção ou não");
		}
	}
}
