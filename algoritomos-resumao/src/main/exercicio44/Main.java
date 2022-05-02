package main.exercicio44;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite um numero: ");
		int n = entrada.nextInt();
		
		while(n <= 0) {
			System.out.println("N deve ser maior que zero.");
			n = entrada.nextInt();
		}
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

}
