package questionario7.exercicio2.main;

import questionario7.exercicio2.models.NotaFiscal;
import questionario7.exercicio2.models.PagamentoEmCartao;
import questionario7.exercicio2.models.PagamentoEmDinheiro;

public class NotaFiscalMain {

	public static void main(String[] args) {
		
		PagamentoEmDinheiro pagamentoDinheiro = new PagamentoEmDinheiro(10, 15);
		PagamentoEmCartao pagamentoCartao = new PagamentoEmCartao(30, "visa", "000999832");
		
		NotaFiscal notaFiscal1 = new NotaFiscal("4247234", "Data: 13/04/2012", pagamentoDinheiro);
		NotaFiscal notaFiscal2 = new NotaFiscal("1231293", "Data: 20/12/2010", pagamentoCartao);
		
		notaFiscal1.imprimirNota();
		System.out.println("\n========================");
		notaFiscal2.imprimirNota();
	}

}
