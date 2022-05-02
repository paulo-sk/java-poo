package main.exercicio12;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Digite a primeira nota do aluno.");
		double n1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double n2 = entrada.nextDouble();
		
		
		if(calcularMedia(n1,n2) >= 6)
			System.out.println("media "+calcularMedia(n1,n2)+". Aluno aprovado.");
		else
			System.out.println("media "+calcularMedia(n1,n2)+". Aluno reprovado.");

	}
	
	public static double calcularMedia(double n1, double n2) {
		return (n1 + n2) / 2;
	}
	

}
