package main.exercicio39;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		String novoCalculo = "N";
		do {
			System.out.println("Digite a primeira nota: ");
			double nota1 = entrada.nextDouble();
			
			while(nota1 < 0 || nota1 > 10) {
				System.out.println("nota invalida, digite novamente (de 0 a 10): ");
				nota1 = entrada.nextDouble();
			}
			
			System.out.println("Digite a segunda nota: ");
			double nota2 = entrada.nextDouble();
			
			while(nota2 < 0 || nota2 > 10) {
				System.out.println("nota invalida, digite novamente (de 0 a 10): ");
				nota2 = entrada.nextDouble();
			}
			
			double media = (nota1 + nota2) / 2;
			System.out.println("Media > "+media);
			
			System.out.println("\nNovo calculo(S/N)?");
			novoCalculo = entrada.next();
			
		}while(novoCalculo.equals("S"));

	}

}
