package ProjetoEscritorio;

import java.util.List;

public class Escritorio {
	
	long metroQuadrado;
	String corParede, corChao;
	Janela janela;
	List<Prateleira> prateleira;
	
	public List<Prateleira> getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(List<Prateleira> prateleira) {
		this.prateleira = prateleira;
	}

	public Escritorio(long metroQuadrado, String corParede, String corChao) {
		this.metroQuadrado = metroQuadrado;
		this.corParede = corParede;
		this.corChao = corChao;
	}

	public long getMetroQuadrado() {
		return metroQuadrado;
	}

	public void setMetroQuadrado(long metroQuadrado) {
		this.metroQuadrado = metroQuadrado;
	}

	public String getCorParede() {
		return corParede;
	}

	public void setCorParede(String corParede) {
		this.corParede = corParede;
	}

	public String getCorChao() {
		return corChao;
	}

	public void setCorChao(String corChao) {
		this.corChao = corChao;
	}

	public Janela getJanela() {
		return janela;
	}

	public void setJanela(Janela janela) {
		this.janela = janela;
	}
	
}
