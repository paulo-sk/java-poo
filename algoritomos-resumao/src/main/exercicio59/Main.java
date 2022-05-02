package main.exercicio59;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Quantos produtos em estoque?");
		int nProdutos = entrada.nextInt();
	
		double somaValor = 0;
		
		//entrada de valores para produtos
		for(int i = 0; i < nProdutos; i++) {
			System.out.println("Valor do produto "+(i+1)+": ");
			somaValor += entrada.nextDouble();
		}
		
		System.out.println("Valor total em estoque: "+somaValor+" || Media: "+(somaValor/nProdutos));
		


	}

}
