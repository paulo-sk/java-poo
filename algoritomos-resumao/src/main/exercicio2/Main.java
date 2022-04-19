package main.exercicio2;
import java.util.Scanner;

import models.exercicio2.Horas;

public class Main {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Digite as horas: ");
		int hora = entrada.nextInt();
		
		System.out.print("\nDigite os minutos: ");
		int minuto = entrada.nextInt();
		
		System.out.print("\nDigite os segundos: ");
		int segundo = entrada.nextInt();
		
		Horas horas = new Horas(hora, minuto, segundo);
		
		int segundosTotal = horas.calcularTotalDeSegundos();
		System.out.println("Total de segundos: "+segundosTotal);
		
	}

}
