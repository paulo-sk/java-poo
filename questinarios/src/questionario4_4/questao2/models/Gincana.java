package questionario4_4.questao2.models;


public class Gincana {
	
	private String[] nomesEquipes;
	private int[] pontosEquipes;
	
	
	public Gincana(String[] nomesEquipes, int[] pontosEquipes) {
		this.nomesEquipes = nomesEquipes;
		this.pontosEquipes = pontosEquipes;
	}
	
	public void adicionarPontos(String nome, int pontos) {
		
		for(int i = 0; i < this.nomesEquipes.length; i++) {
			if(this.nomesEquipes[i].equals(nome)) {
				this.pontosEquipes[i] += pontos;
				
			}
			else
				System.out.println("Nome de equipe invalido.");
				
		}
	}
	
	public void removerPontos(String nome, int pontos) {
		for(int i = 0; i < nomesEquipes.length; i++) {
			if(nomesEquipes[i].equals(nome)) {
				this.pontosEquipes[i] -= pontos;
				
			}
			else
				System.out.println("Nome de equipe invalido.");
				
		}
		
	}
	
	public void ranking() {
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int meio = 0;
		
		for(int i =0; i < pontosEquipes.length; i++) {
			if(pontosEquipes[i] > maior)
				maior = i;
			
			if(pontosEquipes[i] < menor)
				menor = i;
		}
		
		for(int i =0; i < pontosEquipes.length; i++) {
			if(pontosEquipes[i] < menor)
				menor = i;
		}
		//meio
		for(int i =0; i < pontosEquipes.length; i++) {
			if(pontosEquipes[i] <= maior && pontosEquipes[i] >= menor)
			meio = i;
		}
		
		System.out.println("A equipe "+this.nomesEquipes[maior]+" ficou em primeiro com "
		+this.pontosEquipes[maior]);
		
		System.out.println("A equipe "+this.nomesEquipes[meio]+" ficou em segundo com "
				+this.pontosEquipes[meio]);
		
		System.out.println("A equipe "+this.nomesEquipes[menor]+" ficou em terceiro com "
				+this.pontosEquipes[menor]);
		
	}
	
}
