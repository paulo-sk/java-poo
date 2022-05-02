package main.exercicio78;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> numeros = new ArrayList<>();
		
		for(int i= 0 ; i< 10; i++) {
			numeros.add(entrada.nextDouble());
		}
		
		Collections.sort(numeros);
		System.out.println(numeros);
		
		System.out.println("Mais um numero para ser adicionado: ");
		numeros.add(entrada.nextDouble());
		Collections.sort(numeros);
		
		System.out.println(numeros);
	}

}
