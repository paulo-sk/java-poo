package main.exercicio10;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um valor:");
		int valor = entrada.nextInt();
		
		if(valor >=0 ) 
			System.out.println("Valor positivo.");
		
		else
			System.out.println("Valor negativo.");
		
	}

}
