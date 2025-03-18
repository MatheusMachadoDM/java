package aula003_Encapsulamento;

public class AlunoTestar {
	public static void  main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		//aluno1.nome = "Pedro";
		aluno1.setNome("Pedro");
		
		System.out.println(aluno1.getNome());
		
		//aluno1.idade = -20;
		
		aluno1.setIdade(200);
	}
}
