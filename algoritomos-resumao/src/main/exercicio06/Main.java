package main.exercicio06;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		//funcionario recebe salario fixo  + comissao fixa por venda + 5% do valor total das vendas
		System.out.println("Salario do funcionario: ");
		double salario = entrada.nextDouble();
		
		System.out.println("Quantidade de carros vendidos: ");
		int carrosVendidos = entrada.nextInt();
		
		System.out.println("Comissao fixa por venda: ");
		int comissaoFixa = entrada.nextInt();
		
		System.out.println("Valor total de vendas");
		double totalDeVendas = entrada.nextDouble();
		
		double salarioFinal = salario + comissaoFixa*carrosVendidos + totalDeVendas*0.05;
		
		System.out.printf("Salario final: R$%.2f", salarioFinal);
	}
	
	
}
