package main.exercicio50;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int somaNegativos = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o"+i+"º numero: ");
			int n = entrada.nextInt();
			if(n < 0)
				somaNegativos++;
		}
		
		System.out.println("Negativos: "+somaNegativos);
	}

}
