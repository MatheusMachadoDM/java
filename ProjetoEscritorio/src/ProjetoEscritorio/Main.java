package ProjetoEscritorio;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		
		Escritorio escritorioGamer = new Escritorio(40, "cinza", "branco");
		
		Janela janela = new Janela(1,1);
		
		Prateleira prateleiraMenor = new Prateleira(0.2, 2, "branco");
		Prateleira prateleiraMaior = new Prateleira(0.2, 3, "branco");
		
		List<Prateleira> listaDePrateleira = new ArrayList<Prateleira>();
		listaDePrateleira.add(prateleiraMaior);
		listaDePrateleira.add(prateleiraMenor);
		
		escritorioGamer.setJanela(janela);
		escritorioGamer.setPrateleira(listaDePrateleira);
		
		System.out.println(escritorioGamer.getJanela().getAltura());
		System.out.println(escritorioGamer.getPrateleira().get(0).getComprimento());
	}
}
