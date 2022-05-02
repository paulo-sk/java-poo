package main.exercicio60;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	
		double somaValor = 0;
		String simNao = "S";
		int count = 0;
		
		do{
			System.out.println("Valor do produto: ");
			somaValor += entrada.nextDouble();
			
			System.out.println("MAIS MERCADORIAS (S/N)?");
			simNao = entrada.next();
			
			count++;
		}while(simNao.equals("S") || simNao.equals("s"));
		
		System.out.println("Valor total em estoque: "+somaValor+" || Media: "+(somaValor/count));

	}

}
