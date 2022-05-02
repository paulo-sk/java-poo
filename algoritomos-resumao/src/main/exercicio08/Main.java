package main.exercicio08;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Digite a nota 1: ");
		double n1 = entrada.nextDouble();
		
		System.out.println("Digite a nota 1: ");
		double n2 = entrada.nextDouble();
		
		System.out.println("Digite a nota 1: ");
		double n3 = entrada.nextDouble();
		
		System.out.printf("Media final %.2f ", mediaFinal(n1, n2, n3));
		
	}
	
	public static double mediaFinal(double n1, double n2, double n3) {
		return (n1*2 + n2*3 + n3*5) / 10;
	}

}
