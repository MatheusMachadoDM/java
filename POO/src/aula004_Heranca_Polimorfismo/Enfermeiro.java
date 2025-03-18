package aula004_Heranca_Polimorfismo;

public class Enfermeiro extends Pessoa{
	
	int cargaHoraria;
	String setor, cid;
	
	Enfermeiro(String setor, String cid, int cargaHoraria, String nome, String documento, int idade){
		super(nome, documento, idade);
		this.setor = setor;
		this.cid = cid;
		this.cargaHoraria = cargaHoraria;
	}
	
	public void imprimirInfo() {
		super.imprimirInfo();
		System.out.println("Setor: " + this.setor);
		System.out.println("Cid: " + this.cid);
		System.out.println("Carga Horária: " + this.cargaHoraria);
	}
}
