package questionario7.exercicio2.models;

public class PagamentoEmDinheiro extends Pagamento{
	
	private double valorRecebido;
	private double troco;


	public PagamentoEmDinheiro(double valor, double valorRecebido) {
		super(valor);
		this.valorRecebido = valorRecebido;
		this.troco = this.valorRecebido - this.valor;
	}


	@Override
	public String imprimir() {
		return "Valor total do pagamento: $"+this.valor+
				"\nValor recebido: $"+this.valorRecebido+
				"\nTroco: $"+this.troco;
	}
	
}
