package main.exercicio32;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Nome do produto: ");
		String nome = entrada.next();
		
		System.out.println("quantidade: ");
		int quantidade = entrada.nextInt();
		
		System.out.println("preco unitario: ");
		double precoUnitario = entrada.nextDouble();
		
		double total = quantidade*precoUnitario;
		double desconto =  total * 0.02;
		
		if(quantidade > 10) {
			desconto = total*0.05;
			System.out.println("Total: R$"+total+", desconto: R$"+desconto+", valor final: R$"+(total-desconto));
		}
		else if(quantidade > 5 && quantidade <= 10) {
			desconto = total*0.03;
			System.out.println("Total: R$"+total+", desconto: R$"+desconto+", valor final: R$"+(total-desconto));
		}
		
		else
			System.out.println("Total: R$"+total+", desconto: R$"+desconto+", valor final: R$"+(total-desconto));
			

	}

}
