package main.exercicio07;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TC/5 = (TF – 32)/9 (formula) 
		//ler em Fahrenheit e passar para Celsius
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double farenheit = entrada.nextDouble();
		
		double celsius = ((farenheit - 32) / 9) * 5;
		
		System.out.printf("%.0fºF = %.0fºC.", farenheit, celsius);

	}

}
