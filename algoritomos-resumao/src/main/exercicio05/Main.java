package main.exercicio05;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o custo de fabrica do carro: ");
		double custoDeFabrica = entrada.nextDouble();
		
		System.out.printf("Custo final ao consumidor > R$%.2f.", custoFinal(custoDeFabrica));
		
	}
	
	public static double custoFinal(double custoDeFabrica) {
		return custoDeFabrica + custoDeFabrica*0.28 + custoDeFabrica*0.45;
	}

}
