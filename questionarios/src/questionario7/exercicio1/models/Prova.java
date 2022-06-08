package questionario7.exercicio1.models;

public class Prova extends Avaliacao{
	
	private double tempoDeDuracao;
	private int quantidadeDeQuestoes;
	private boolean consultaAltorizada;
	
	public Prova(String nome, double nota, double tempoDeDuracao, int quantidadeDeQuestoes,
			boolean consultaAltorizada) {
		super(nome, nota);
		this.tempoDeDuracao = tempoDeDuracao;
		this.quantidadeDeQuestoes = quantidadeDeQuestoes;
		this.consultaAltorizada = consultaAltorizada;
	}

	@Override
	public String toString() {
		return "Prova [tempoDeDuracao=" + tempoDeDuracao + ", quantidadeDeQuestoes=" + quantidadeDeQuestoes
				+ ", consultaAltorizada=" + consultaAltorizada + ", nome=" + nome + ", nota=" + nota + "]";
	}

	
}
