package main.exercicio81;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] v1 = new int[5];
		
		for(int i = 0; i < v1.length; i++) {
			System.out.println("Valor "+(i+1)+" do vetor: ");
			v1[i] = entrada.nextInt();
			
		}
		
		System.out.println("Verificar quantas vezes o proximo numero N se repete: ");
		int n = entrada.nextInt();
		int count = 0;
		
		for(int i = 0; i < v1.length; i++) {
			if(v1[i] == n)
				count++;
		}
		
		System.out.println("N se repete "+count+" vezes.");

	}

}


