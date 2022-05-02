package main.exercicio22;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
/*) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.*/
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		ArrayList<Double> numeros = new ArrayList<>(); //array list de double
		
		System.out.println("Digite os 3 numeros: ");
		numeros.add(entrada.nextDouble());
		numeros.add(entrada.nextDouble());
		numeros.add(entrada.nextDouble());
		
		double maiorNumero = Collections.max(numeros);
		
		System.out.println("maior número: "+maiorNumero);

	}

}
