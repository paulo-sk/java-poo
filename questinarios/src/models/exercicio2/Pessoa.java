package models.exercicio2;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private Livro livro;

	
	public Pessoa(String nome, String cpf, Livro livro) {
		this.nome = nome;
		this.cpf = cpf;
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]\n" + livro + "]";
	}
	
	
	
}
