package main.exercicio74;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] numeros = new int[20];
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero");
			int n = entrada.nextInt();
			numeros[i] = n;
			
		}
		
		for(int i = numeros.length - 1; i >= 0 ; i--) {
			System.out.print(numeros[i]+" ");
		}

	}

}
