package aula004_Heranca_Polimorfismo;


public class Main {
	public static void main(String[] args) {
		Pessoa paciente = new Paciente("2870", "Unimed", "Jose","12312312", 20);//Usando polimorfismo
		Pessoa enfermeiro = new Enfermeiro("Saúde", "290879", 20, "Maria", "123123123", 40);
		
		/*Polimorfismo é usar o mesmo método para obter resultados diferentes*/
		
		paciente.imprimirInfo();
		System.out.printf("\n");
		enfermeiro.imprimirInfo();
	}
}
