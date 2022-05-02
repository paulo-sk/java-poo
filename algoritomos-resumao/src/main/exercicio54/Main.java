package main.exercicio54;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int soma = 0;
		for(int i = 0; i < 10; i++) {
			int n = entrada.nextInt();
			soma +=n;
		}
		System.out.println("Soma: "+soma);

	}

}
