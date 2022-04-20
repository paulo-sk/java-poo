package main.exercicio03;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);	
	
	public static void main(String[] args) {
		System.out.print("Digite os reais a serem convertidos: ");
		double reais = entrada.nextDouble();
		
		System.out.printf("R$ %.2f = ", reais);
		System.out.print("$ "+ converterParaDolar(reais));
		
	}
	
	static public double converterParaDolar(double reais) {
		 double dolares = reais / 4.05;
		return dolares;
	}
}
