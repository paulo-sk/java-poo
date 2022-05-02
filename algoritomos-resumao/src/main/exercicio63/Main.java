package main.exercicio63;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Preco do produto 1: ");
		int n = entrada.nextInt();
		
		int maior = n;
		int media = n;
		
		for(int i = 0; i < 14; i++){
			System.out.println("Preco do produto "+(i+2)+":");
			n = entrada.nextInt();
			media += n;
			
			if(n > maior)
				maior = n;
		}
		
		System.out.println("Maior numero digitado: "+maior);
		System.out.println("Media: "+media/15);

	}

}
