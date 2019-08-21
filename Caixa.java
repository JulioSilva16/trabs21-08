package trabs;

public class Caixa {
	
	private int altura;
	private int largura;
	private int profundidade;
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public int getProfundidade() {
		return profundidade;
	}
	
	public void setProfundidade(int profundidade) {
		this.profundidade = profundidade;
	}
	
	public int capacidade(int altura, int largura, int profundidade) {
		return (altura * largura * profundidade) ;
	}
	
	public boolean ladosiguais(int altura, int largura, int profundidade) {
		if (altura == largura && altura == profundidade){
			return true;
		}
		else {
		return false;
		}
	}
	
}

