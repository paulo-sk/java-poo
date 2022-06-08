package questionario4_4.questao2.main;

import java.util.ArrayList;
import java.util.Scanner;

import questionario4_4.questao2.models.Gincana;

public class Main {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nomesEquipes = new String[3];
		int[] pontosEquipes = new int[3];
		
		System.out.println("Digite o nome da equipe 1: ");
		nomesEquipes[0] = entrada.nextLine();
		
		System.out.println("Digite o nome da equipe 2: ");
		nomesEquipes[1] = entrada.nextLine();
		
		System.out.println("Digite o nome da equipe 3: ");
		nomesEquipes[2] = entrada.nextLine();
		
		Gincana gincana = new Gincana(nomesEquipes, pontosEquipes);
		
		gincana.adicionarPontos("A", 2);
		gincana.adicionarPontos("B", 1);
		gincana.adicionarPontos("C", 3);
		
		gincana.ranking();
	}

}
