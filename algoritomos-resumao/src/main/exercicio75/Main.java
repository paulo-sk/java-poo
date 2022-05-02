package main.exercicio75;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Tamanho do vetores: ");
		int n = entrada.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB= new int[n];
		int[] vetorSomaAB = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Vetor A, valor "+(i+1)+": ");
			vetorA[i] = entrada.nextInt();
			
			System.out.println("Vetor B, valor "+(i+1)+": ");
			vetorB[i] = entrada.nextInt();
			
			vetorSomaAB[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.print("vetorSomaAB: ");
		for(int i = 0; i < n; i++) {
			System.out.print(vetorSomaAB[i]+" ");
		}

	}

}
