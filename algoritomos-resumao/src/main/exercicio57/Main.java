package main.exercicio57;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Primeiro valor: ");
		double primeiroValor = entrada.nextDouble();
		
		System.out.println("Segundo valor: ");
		double segundoValor = entrada.nextDouble();
		
		while(segundoValor <= primeiroValor) {
			System.out.println("O segundo valor deve ser maior que o primeiro, digite novamente: ");
			segundoValor = entrada.nextDouble();
		}
		
		for(double i =  primeiroValor; i <= segundoValor; i++) {
			System.out.println(Math.round(i)); //Math.round (arredendamento do double)
		}

	}

}
