package main.exercicio35;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite um valor: ");
		double valor1 = entrada.nextInt();
	
		double valor2 = 0;
		
		do{
			System.out.println("digite o segundo valor: ");
			valor2 = entrada.nextDouble();
			if(valor2 == 0)
				System.out.println("***Valor invalido***");
			
		}while(valor2 == 0);
		
		System.out.println(valor1+" / "+valor2+" = "+valor1/valor2);
	}

}
