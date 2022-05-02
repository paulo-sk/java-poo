package main.exercicio17;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Quantas horas trabalhadas no mes:");
		int horasMes = entrada.nextInt();
		
		System.out.println("Salario por hora trabalhada:");
		int salarioHora = entrada.nextInt();
		
		System.out.println("Salario total: "+calcularSalarioTotal(horasMes, salarioHora));
		

	}
	
	public static double calcularSalarioTotal(double horasMes, double salarioHora) {
		double salarioExtra = 0;
		if(horasMes > 160) {
			salarioExtra = (horasMes - 160) *(salarioHora*0.5);
		}
		return (horasMes * salarioHora) + salarioExtra;
	}

}
