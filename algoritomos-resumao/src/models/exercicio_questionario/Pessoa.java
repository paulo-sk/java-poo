package models.exercicio_questionario;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	public Pessoa(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Pessoa() {
		
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}
	
	

}
