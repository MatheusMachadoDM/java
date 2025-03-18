package aula004_Heranca_Polimorfismo;

public class Paciente extends Pessoa{//extends faz com que a classe herde atributos e métodos da classe pai
	
	String matricula, planoSaude;
	
	Paciente(String matricula, String planoSaude, String nome, String documento, int idade){
		
		super(nome, documento, idade); //Chama os atributos
		this.matricula = matricula;
		this.planoSaude = planoSaude;
	}
	public void imprimirInfo() {
		super.imprimirInfo(); //chama o método
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Plano de saúde: " + this.planoSaude);
	}
}
