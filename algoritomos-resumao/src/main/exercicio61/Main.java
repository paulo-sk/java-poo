package main.exercicio61;
import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * essa questao pede pra digitar 100 valores e ver qual foi o maior e o menor
		 * mas 100 é muito entao deixei a opcao de colar quantas vezes quero repetir,
		 *  pois a logica é a mesma.
		 * se vc quiser digitar 100 vezes, fique a vontade =)*/
		
		System.out.println("Quantos valores: ");
		int valores = entrada.nextInt();
		int count = 1;
		
		System.out.println("Digite um numero: ");
		int n = entrada.nextInt();
		
		int maior = n;
		int menor = n;
		
		while (count < valores){
			System.out.println("Digite um numero: ");
			n = entrada.nextInt();
			if(n > maior)
				maior = n;
			
			if(n < menor)
				menor = n;
			
			count++;
		}
		
		System.out.println("Maior numero digitado: "+maior);
		System.out.println("Menor numero digitado: "+menor);

	}

}
