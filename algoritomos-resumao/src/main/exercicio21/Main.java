package main.exercicio21;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Digite um valor: ");
		double valor = entrada.nextDouble();
		
		if(valor < 0 )
			System.out.println("Valor negativo.");
		
		if(valor == 0)
			System.out.println("Valor igual a zero.");
		
		if(valor > 0 )
			System.out.println("Valor positivo.");

	}
	

}
