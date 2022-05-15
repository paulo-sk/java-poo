package questionario4_4.exercicio1.models;

public class ContadorDePessoas {
		private int limitePessoas;
		private int qtdePresentes;
		private int qtdeTotal;
		
		public ContadorDePessoas(int limitePessoas) {
			this.limitePessoas = limitePessoas;
		}
		
		public void registraEntrada(int quantidade) {
			if((this.limitePessoas - this.qtdePresentes) >= quantidade) {
				this.qtdeTotal += quantidade;
				this.qtdePresentes += quantidade;
			}
			
			else if ((this.limitePessoas - this.qtdePresentes) < quantidade) {
				int vagas = (this.limitePessoas - this.qtdePresentes);
				System.out.println("Nao cabe "+quantidade+" pessoas pois tem  "+vagas+" vagas no momento.\n");
				}
				
		}
		public void registraSaida(int quantidade) {
			if((this.qtdePresentes - quantidade) >= 0) {
				this.qtdePresentes -= quantidade;
			}
			else
				System.out.println("Quantidade de saida deve ser menor ou igual ao numero de pessoas presentes, atualmente: "
			+this.qtdePresentes+" pessoas presentes.");
		}
		
		public void mostrarRelatorio() {
			System.out.println("Quantidade de pessoas presentes: "+this.getQtdePresentes());
			System.out.println("Quantidade de pessoas que entraram no restaurante: "+this.getQtdeTotal());
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
