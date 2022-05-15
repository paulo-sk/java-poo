package questionario4_4.exercicio2.models;

public class Equipe {
	
	private String nome;
	private int pontos = 0;
	
	public Equipe(String nome) {
		this.nome = nome;
	}
	
	public void adicionarPontos(int pontos) {
		this.pontos += pontos;
	}
	
	public void removerPontos(int pontos) {
		this.pontos -= pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
}
