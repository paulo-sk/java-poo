package main.exercicio25;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	
		//verifica se e um triangulo equilatero, isoceles ou escaleno
		
		System.out.println("Digite 3 lados do triangulo: ");
		int ladoA = entrada.nextInt();
		int ladoB= entrada.nextInt();
		int ladoC = entrada.nextInt();
		
		if(ladoA > (ladoB + ladoC) || ladoB > (ladoA + ladoC) || ladoC > (ladoA + ladoB)) {
			
		}
		else {
			if(ladoA == ladoB & ladoB == ladoC)
				System.out.println("Triangulo Equilatero.");
			
			else if(ladoA != ladoB && ladoA != ladoC && ladoC != ladoB)
				System.out.println("Triangulo Escaleno.");
			
			else
				System.out.println("Triangulo Isoceles.");
		}

	}

}