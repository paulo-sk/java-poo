package questionario4_4.exercicio2.main;

import java.util.ArrayList;
import java.util.Scanner;

import questionario4_4.exercicio2.models.Equipe;
import questionario4_4.exercicio2.models.Gincana;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("===========GINCANA===========");
		
		ArrayList<Equipe> equipes = new ArrayList<Equipe>();
		
		System.out.println("Nome da equipe 1: ");
		Equipe equipe1 = new Equipe(entrada.next());
		
		System.out.println("Nome da equipe 2: ");
		Equipe equipe2 = new Equipe(entrada.next());
		
		System.out.println("Nome da equipe 3: ");
		Equipe equipe3 = new Equipe(entrada.next());
		
		equipes.add(equipe1);
		equipes.add(equipe2);
		equipes.add(equipe3);
		
		Gincana gincana = new Gincana(equipes);
		String opcao;
		
		do {
			
			System.out.println("1 - ADICIONAR PONTOS");
			System.out.println("2 - REMOVER PONTOS");
			System.out.println("3 - MOSTRAR O RANKING E ENCERRAR");
			opcao = entrada.next();
			String nomeEquipe = "";
			switch (opcao) {

			case "1":
				System.out.println("Nome da equipe: ");
				nomeEquipe = entrada.next();
				
				for(Equipe equipe: equipes) {
					if(equipe.getNome().equals(nomeEquipe)) {
						System.out.println("Pontos a serem adicionados: ");
						int pontosAdicionados = entrada.nextInt();
						equipe.adicionarPontos(pontosAdicionados);
						break;
					}
				}
					System.out.println("nome de equipe invalido");
					
				break;

			case "2":
				System.out.println("Nome da equipe: ");
				nomeEquipe = entrada.next();
				
				for(Equipe equipe: equipes) {
					if(equipe.getNome().equals(nomeEquipe)) {
						System.out.println("Pontos a serem removidos: ");
						int pontosRemovidos = entrada.nextInt();
						equipe.removerPontos(pontosRemovidos);
						break;
					}
				}
					System.out.println("nome de equipe invalido");
					
				break;

			default:
				if(!opcao.contentEquals("3"))
					System.out.println("Opcao invalida.");
			}
			
			
		}while(!opcao.equals("3"));
		
		gincana.somaPontuacaoTotal();
		gincana.mostrarRanking();
	}

}
