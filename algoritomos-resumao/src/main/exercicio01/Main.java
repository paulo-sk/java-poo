package main.exercicio01;

import models.exercicio1.Triangulo;
import java.util.Scanner;

public class Main {
	
	public static Scanner entrada = new Scanner(System.in);	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("digite o valor do lado 1: ");
		int lado1 = entrada.nextInt();
		
		System.out.println("digite o valor do lado 2: ");
		int lado2 = entrada.nextInt();
		
		System.out.println("digite o valor do lado 3: ");
		int lado3 = entrada.nextInt();
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		System.out.println("Perimetro: "+triangulo.calcularPerimetro());
		
		
	}	

}
