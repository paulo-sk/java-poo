package main.exercicio47;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Tabuada, digite um numero.");
		int n = entrada.nextInt();
		
		while(n <= 0) {
			System.out.println("Numero deve ser maior que zero.");
			n = entrada.nextInt();
		}
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}

	}

}
