package questionario4_4.questao1.models;

public class ContadorDePessoas {
	
	private int limitePessoas;
	private int qtdePresentes;
	private int qtdeTotal;
	
	public ContadorDePessoas(int limite) {
		this.limitePessoas = limite;
	}
	
	public ContadorDePessoas() {
		
	}
	
	public void registraEntrada(int quantidade) {
		
		if((this.limitePessoas - this.qtdePresentes) >= quantidade) {
			this.qtdePresentes += quantidade;
			this.qtdeTotal += quantidade;
		}
		
		else {
			if(this.qtdePresentes == this.limitePessoas)
				System.out.println("******Restaurante lotado, epere a saida de clientes.******");
			
			else
				System.out.println("******Quantidade não suportada, tem apenas "
				+(this.limitePessoas - this.qtdePresentes)+" vagas no restaurante******");
			
		}
		
	}
	
	public void registraSaida(int quantidade){
		if((this.qtdePresentes - quantidade) >= 0) {
			this.qtdePresentes -= quantidade;
		}
		
		else {
			System.out.println("O registro de saida deve ser igual ou inferior a quantidade de pessoas presentes, que agora sao: "
					+this.qtdePresentes);
		}
		
		
	}
	
	public void mostrarRelatorio() {
		System.out.println("Quantidade de pessoas no restaurant: "+this.getQtdePresentes());
		System.out.println("Total de pessoas que entraram no restaurant: "+this.getQtdeTotal());
	}

	public int getLimitePessoas() {
		return limitePessoas;
	}


	public int getQtdePresentes() {
		return qtdePresentes;
	}


	public int getQtdeTotal() {
		return qtdeTotal;
	}
	
	
}
