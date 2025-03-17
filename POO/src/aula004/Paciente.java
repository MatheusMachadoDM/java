package aula004;

public class Paciente extends Pessoa{
	
	String matricula, planoSaude;
	
	Paciente(String matricula, String planoSaude, String nome, String documento, int idade){
		
		super(nome, documento, idade);
		this.matricula = matricula;
		this.planoSaude = planoSaude;
	}
	public void imprimirInfo() {
		super.imprimirInfo();
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Plano de saúde: " + this.planoSaude);
	}
}
