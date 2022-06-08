package questionario9_revisao.exercicio1.model;

import java.util.Calendar;

public class Jogador {

	private String nome;

	private String posicao;

	private Calendar anoDeNascimento;

	private String nacionalidade;

	private double altura;

	private double peso;
	

	public Jogador(String nome, String posicao, String nacionalidade, double altura, double peso) {

		this.nome = nome;

		this.posicao = posicao;

		this.nacionalidade = nacionalidade;

		this.altura = altura;

		this.peso = peso;

	}

	public int calculaIdade() {

		Calendar dataAtual = Calendar.getInstance();

		int nascimento = anoDeNascimento.get(Calendar.YEAR);

		int anoAtual = dataAtual.get(Calendar.YEAR);

		return anoAtual - nascimento;

	}

	public int tempoParaAposentar() {

		if (this.posicao.equalsIgnoreCase("atacante")) {
			if(calculaIdade() >= 35) {
				System.out.println("Aposentado");
				return 0;
			}
			return 35 - calculaIdade();

		}
		if (this.posicao.equalsIgnoreCase("meio-campo")) {
			if(calculaIdade() >= 38) {
				System.out.println("Aposentado");
				return 0;
			}
			return 38 - calculaIdade();
		}
		
		if(calculaIdade() >= 40) {
			System.out.println("Aposentado");
			return 0;
		}
		return 40 - calculaIdade();

	}


	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", posicao=" + posicao + ", nacionalidade=" + nacionalidade + ", altura="
				+ altura + ", peso=" + peso + ", calculaIdade()=" + calculaIdade() + ", tempoParaAposentar()="
				+ tempoParaAposentar() + "]";
	}

	public String getNome() {

		return nome;

	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public String getPosicao() {

		return posicao;

	}

	public void setPosicao(String posicao) {

		this.posicao = posicao;

	}

	public Calendar getAnoDeNascimento() {

		return anoDeNascimento;

	}

	public void setAnoDeNascimento(Calendar anoDeNascimento) {

		this.anoDeNascimento = anoDeNascimento;

	}

	public String getNacionalidade() {

		return nacionalidade;

	}

	public void setNacionalidade(String nacionalidade) {

		this.nacionalidade = nacionalidade;

	}

	public double getAltura() {

		return altura;

	}

	public void setAltura(double altura) {

		this.altura = altura;

	}

	public double getPeso() {

		return peso;

	}

	public void setPeso(double peso) {

		this.peso = peso;

	}

}