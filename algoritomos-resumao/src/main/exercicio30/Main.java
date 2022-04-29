package main.exercicio30;

import java.util.Scanner;

public class Main {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		//morango 2,50 por kg ate 5kg, acima de 5kg fica 2,20 o kg
		//maca 1,80 por kg ate 5kg, acima de 5kg fica por 1,50 o kg
		//caso a compra total passe de 25 reais, recebe desconto de 10%
		
		System.out.println("kg de morando: ");
		double kgMorango = entrada.nextDouble();
		
		System.out.println("kg macã: ");
		double kgMaca = entrada.nextDouble();
		
		System.out.printf("Valor total: R$%.2f.", calcularValor(kgMorango, kgMaca));

	}
	
	public static double calcularValor(double kgMorango, double kgMaca){
		double precoMorango;
		double precoMaca;
		
		if(kgMorango <= 5) {
			precoMorango = kgMorango * 2.50;
		}
		
		else {
			precoMorango = kgMorango * 2.20;
		}
		
		if(kgMaca <= 5) {
			precoMaca = kgMaca * 1.80;
		}
		
		else {
			precoMaca = kgMaca * 1.50;
		}
		
		
		double total = precoMorango + precoMaca;
		
		if(total > 25)
			return total - total*0.1;
		else
			return total;
	}

}
