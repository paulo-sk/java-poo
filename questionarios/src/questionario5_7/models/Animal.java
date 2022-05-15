package questionario5_7.models;

public class Animal {
	
	protected String nome;
	protected String cor;
	protected int quantidadeDePatas;	
	
	//coloquei esse construtor em animal para todos os objetos sejam inicializados com ele e nao precise de get/set
	public Animal(String nome, String cor, int quantidadeDePatas) {
		this.nome = nome;
		this.cor = cor;
		this.quantidadeDePatas = quantidadeDePatas;
	}
	
	public void dadosAnimal() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cor: "+this.cor);
		System.out.println("Quantidade de patas: "+this.quantidadeDePatas);
	}
}
