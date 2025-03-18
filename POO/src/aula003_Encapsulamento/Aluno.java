package aula003_Encapsulamento;

public class Aluno {
	
	//Encapsulamento == Private, setter e getter
	
	/*Private torna o atributo inacessivel por fora da classe,
	 * agora para acessar precisamos criar um método público
	 * assim conseguimos definir condições para acessar os atributos
	 * */
	
	private String nome; 
	private int idade;
	
	public void setNome(String nome) { //Usado para modificar o valor
		this.nome = nome;
	}
	
	public String getNome() { //Usado para consultar o valor
		return nome;
	}
	
	public void setIdade(int idade) {
		if(idade >= 0 && idade <= 99) {
			this.idade = idade;
			System.out.println("Idade cadastrada");
		}else {
			System.out.println("Erro! Idade inválida");
		}
	}
}
