package main.exercicio35;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite um valor: ");
		int valor1 = entrada.nextInt();
	
		int valor2 = 0;
		
		do{
			System.out.println("digite o segundo valor: ");
			valor2 = entrada.nextInt();
			if(valor2 == 0)
				System.out.println("***Valor invalido***");
			
		}while(valor2 == 0);
	}

}
