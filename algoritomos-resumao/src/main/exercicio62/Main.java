package main.exercicio62;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Quantos valores: ");
		int valores = entrada.nextInt();
		int count = 1;
		
		System.out.println("Digite um numero: ");
		int n = entrada.nextInt();
		
		int maior = n;
		int media = n;
		
		while (count < valores){
			System.out.println("Digite um numero: ");
			n = entrada.nextInt();
			media += n;
			
			if(n > maior)
				maior = n;
		
			
			count++;
		}
		
		System.out.println("Maior numero digitado: "+maior);
		System.out.println("Media: "+media/valores);
	}

}
