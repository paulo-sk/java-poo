package main.exercicio73;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static int[] numeros = new int[10];
	public static int[] m = new int[numeros.length];
	
	public static void main(String[] args) {
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero");
			int n = entrada.nextInt();
			numeros[i] = n;
			
		}
		System.out.println("Valor x: ");
		int x = entrada.nextInt();
		
		for(int i = 0; i < numeros.length; i++) {
			m[i] = x * numeros[i];
			System.out.print(m[i]+" ");
		}
	

	}
	

}
