package main.exercicio69;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		String[] nomes = new String[10];
		
		for(int i = 0; i < nomes.length; i++) {
			
			System.out.println("Digite um nome: ");
			String nome = entrada.next();
			
			nomes[i] = nome;
		}
		
		System.out.println("Digite o ultimo nome: ");
		String nomeAchei = entrada.next();
		
		for(int i = 0; i < nomes.length; i++) {
			
			if(nomes[i].equals(nomeAchei)) {
				System.out.println("ACHEI.");
				break;
			}
			else if(i == nomes.length - 1) {
				System.out.println("NAO ACHEI");
				break;
			}
			
		}

	}

}
