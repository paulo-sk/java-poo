package main.exercicio28;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Esolha o tipo de combustivel; A-(alcool) ou G-(gasolina):");
		String tipo = entrada.next();
		
		System.out.println("Quantos litros? ");
		int litros = entrada.nextInt();
		
		double preco;
		
		if(tipo == "A")
			 preco = 2.9;
		else
			preco = 3.30;
			
		
		System.out.printf("Valor a ser pago: R$%.2f.",valor(preco, litros));

	}
	
	public static double valor(double preco, int litros) {
		return preco * litros;
	}

}
