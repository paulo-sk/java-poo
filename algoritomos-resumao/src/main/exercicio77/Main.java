package main.exercicio77;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Double> numeros = new ArrayList<>();
		
		for(int i= 0 ; i< 10; i++) {
			numeros.add(entrada.nextDouble());
		}
		
		Collections.sort(numeros);
		
		System.out.println(numeros);
		System.out.println(numeros.get(2));
	}
	
}
