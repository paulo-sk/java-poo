package main.exercicio18;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Salario fixo do vendedor: ");
		double salarioFixo = entrada.nextDouble();
		
		System.out.println("Valor total das vendas efetuadas: ");
		double valorTotalDeVendas = entrada.nextDouble();
		
		System.out.println("Salario total: R$"+calcularSalarioTotal(salarioFixo, valorTotalDeVendas)+".");
		
		
	}
	
	public static double calcularSalarioTotal(double salarioFixo, double valorTotalDeVendas) {
		double comissao = valorTotalDeVendas * 0.03;
		
		if(valorTotalDeVendas > 1500) {
			comissao = (1500* 0.03) + (valorTotalDeVendas - 1500) *0.05; 
		}
		
		return salarioFixo + comissao;
		
	}

}
