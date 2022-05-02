package main.exercicio79;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Double> numeros = new ArrayList<>();
		
		for(int i= 0 ; i< 20; i++) {
			numeros.add(entrada.nextDouble());
		}
		
		System.out.println(numeros);
		
		System.out.println("Mais um numero para ser retirado: ");
		double x = entrada.nextDouble();
		
		if(numeros.contains(x))
			numeros.remove(Double.valueOf(x)); //ainda nao entendi porque dessa forma elimina por valor e nao pode index
		
		System.out.println(numeros);
		

	}

}
