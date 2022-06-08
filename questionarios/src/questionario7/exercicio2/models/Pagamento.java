package questionario7.exercicio2.models;

public abstract class Pagamento {
	
	protected double valor;
	
	public Pagamento(double valor) {
		this.valor = valor;
	}


	public abstract String imprimir();
	
}
