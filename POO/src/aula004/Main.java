package aula004;


public class Main {
	public static void main(String[] args) {
		Paciente paciente = new Paciente("2870", "Unimed", "Jose","12312312", 20);
		Pessoa enfermeiro = new Enfermeiro("Saúde", "290879", 20, "Maria", "123123123", 40);
		
		paciente.imprimirInfo();
		System.out.printf("\n");
		enfermeiro.imprimirInfo();
	}
}
