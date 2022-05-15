package questionario4_4.exercicio2.models;

import java.util.ArrayList;
import java.util.Comparator;

public class Gincana {
	
	private ArrayList<Equipe> equipes = new ArrayList<Equipe>();
	private int quantidadeTotalDePontos;

	public Gincana(ArrayList<Equipe> equipes) {
		this.equipes = equipes;
	}
	
	
	public void somaPontuacaoTotal() {
		for(Equipe equipe: equipes) {
			this.quantidadeTotalDePontos += equipe.getPontos();
		}
		System.out.println("Soma total de pontos de todas as equipes: "+quantidadeTotalDePontos);
	}
	public void mostrarRanking() {
		
		//comando abaixo da um sort() nos objetos comparando algum atributo do mesmo, aqui no caso o getPontos().
		equipes.sort(Comparator.comparing(Equipe::getPontos));
		
		//como nao deu pra reverter com collection, nao sei porque, entao usei um for com index para reverter a ordem.
		System.out.println();
		for(int i = (equipes.size() - 1); i >=0; i--) {
			System.out.println("A equipe \""+equipes.get(i).getNome()+"\" ficou com "+equipes.get(i).getPontos());
		}
		
	
	}
	
	
}
