package questionario7.exercicio1.models;

public abstract class Avaliacao {
	protected String nome;
	protected double nota;
	
	public Avaliacao(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	//ao inves de getInfo, usei o toString que, pra mim, faz mas sentido nesse caso.
	@Override
	public String toString() {
		return "Avaliacao [nome=" + nome + ", nota=" + nota + "]";
	}
	
	
}
