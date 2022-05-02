package main.exercicio80;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int[] v1 = new int[15];
		int[] v2 = new int[15];
		
		for(int i = 0; i < v1.length; i++) {
			System.out.println("Valor "+(i+1)+" do vetor v1: ");
			v1[i] = entrada.nextInt();
			
			System.out.println("Valor "+(i+1)+" do vetor v2: ");
			v2[i] = entrada.nextInt();
		}
		int count = 0;
		
		for(int i = 0; i < v1.length; i++) {
			if(v1[i] == v2[i])
				count++;
		}
		
		System.out.println("Quantidade de valores repetidos na mesma posicao: "+count);

	}

}
