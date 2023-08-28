package Modelos;

public class Audio {
	private String titulo;
	private int totalReproducoes;
	private int totalCurtidas;
	private int Classificacao;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getTotalReproducoes() {
		return totalReproducoes;
	}
	
	public int getTotalCurtidas() {
		return totalCurtidas;
	}
	public int getClassificacao() {
		return Classificacao;
	}
	
	public void curte() {
		this.totalCurtidas ++;
	}
	
	public void reproduz() {
		this.totalReproducoes ++;
	}
	
}
