package questionario7.exercicio1.models;

public class Seminario extends Avaliacao{
	private String tema;
	private double tempoDeDuracao;
	
	public Seminario(String nome, double nota, String tema, double tempoDeDuracao) {
		super(nome, nota);
		this.tema = tema;
		this.tempoDeDuracao = tempoDeDuracao;
	}

	@Override
	public String toString() {
		return "Seminario [tema=" + tema + ", tempoDeDuracao=" + tempoDeDuracao + ", nome=" + nome + ", nota=" + nota
				+ "]";
	}
	
}
