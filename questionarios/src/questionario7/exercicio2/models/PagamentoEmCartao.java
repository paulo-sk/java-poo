package questionario7.exercicio2.models;

public class PagamentoEmCartao extends Pagamento{
	
	private String bandeira;
	private String numeroTransacao; //usei String aqui pois nao faz sentido pra mim usar long nesse caso

	public PagamentoEmCartao(double valor, String bandeira, String numeroTransacao) {
		super(valor);
		this.bandeira = bandeira;
		this.numeroTransacao = numeroTransacao;
	}


	@Override
	public String imprimir() {
		return "Valor total do pagamento: $"+this.valor+
				"\nBandeira: $"+this.bandeira+
				"\nNumero de transacao: "+this.numeroTransacao;
	}
	
}
