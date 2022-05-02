package main.exercicio72;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int[] numeros = new int[20];
		Integer menor = Integer.MAX_VALUE;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero positivo");
			int n = entrada.nextInt();
			//zeros e negativos sao ignorados
			while(n <=0 ) {
				System.out.println("Valor invalido, digite um numero positivo: ");
				n = entrada.nextInt();
			}
			
			numeros[i] = n;
			if(n < menor)
				menor = n;
		}
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == menor) {
				System.out.println("Menor numero digitado foi "+numeros[i]+",  na posicao: "+i);
			}
				
		}

	}

}
