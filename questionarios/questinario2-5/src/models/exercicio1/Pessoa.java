package models.exercicio1;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private String email;
	private Endereco endereco;
	
	public Pessoa(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public void imprime() {
		System.out.println("Nome: "+this.nome);
		System.out.println("telefone: "+this.telefone);
		System.out.println("==========endereco=========");
		System.out.println("cep: "+this.endereco.getCep());
		System.out.println("bairro: "+this.endereco.getBairro());
		System.out.println("rua: "+this.endereco.getRua());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
