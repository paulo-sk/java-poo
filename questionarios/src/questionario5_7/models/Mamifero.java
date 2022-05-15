package questionario5_7.models;

public class Mamifero extends Animal{
	
	private String tipoAlimentacao;
	
	public Mamifero(String nome, String cor, int quantidadeDePatas, String tipoAlimentacao) {
		super(nome, cor, quantidadeDePatas);
		this.tipoAlimentacao = tipoAlimentacao;
	}
	
	public void dadosMamifero() {
		dadosAnimal();
		System.out.println("Tipo de alimentação: "+this.tipoAlimentacao);
	}
	
	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}
}
