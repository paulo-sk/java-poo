package main.exercicio49;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// Reescreva o exercício 51 utilizando a estrutura ENQUANTO e um CONTADOR
		//vou supor que é o exercico 47
		
		System.out.println("Tabuada, digite um numero.");
		int n = entrada.nextInt();
		
		while(n <= 0) {
			System.out.println("Numero deve ser maior que zero.");
			n = entrada.nextInt();
		}
		
		int i = 1;
		while(i <= 10) {
			System.out.println(n+" x "+i+" = "+(n*i));
			i++;
		}

	}

}
