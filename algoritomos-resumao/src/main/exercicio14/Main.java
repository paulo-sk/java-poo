package main.exercicio14;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = entrada.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = entrada.nextInt();
		
		if(valor1 > valor2) {
			System.out.println(valor1+" > "+valor2);
		}
		
		else if(valor1 == valor2) {
			System.out.println(valor1+" = "+valor2);
		}
		
		else
			System.out.println(valor2+" > "+valor1);
			
	}

}
