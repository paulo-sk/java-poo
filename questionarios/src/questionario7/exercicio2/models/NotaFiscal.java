package questionario7.exercicio2.models;

public class NotaFiscal {
	private String numeroNota;
	private String resumo;
	private Pagamento pagamento;
	
	public NotaFiscal(String numeroNota, String resumo, Pagamento pagamento) {
		this.numeroNota = numeroNota;
		this.resumo = resumo;
		this.pagamento = pagamento;
	}
	
	public void imprimirNota() {
		if (this.pagamento instanceof PagamentoEmDinheiro) {
			PagamentoEmDinheiro pagamentoDinheiro = (PagamentoEmDinheiro) this.pagamento;
			System.out.println("Nota fiscal: "+this.numeroNota);
			System.out.println("Resumo: "+this.resumo);
			System.out.println("Forma de pagament em dinheiro: "+pagamentoDinheiro.imprimir());
		}
		
		if (this.pagamento instanceof PagamentoEmCartao) {
			PagamentoEmCartao pagamentoCartao = (PagamentoEmCartao) this.pagamento;
			System.out.println("Nota fiscal: "+this.numeroNota);
			System.out.println("Resumo: "+this.resumo);
			System.out.println("Forma de pagamento em cartao: "+pagamentoCartao.imprimir());
		}
	}


	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	
}
