package ProjetoEscritorio;

public class Prateleira {
	
	double largura, comprimento;
	String cor;
	
	public Prateleira(double largura, double comprimento, String cor) {
		this.comprimento = comprimento;
		this.largura = largura;
		this.cor = cor;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
