package main.exercicio24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		System.out.println("Digite 3 numeros: ");
		numeros.add(entrada.nextInt());
		numeros.add(entrada.nextInt());
		numeros.add(entrada.nextInt());
		
		Collections.sort(numeros);//ordem crescente por padrao
		
		System.out.println(numeros);
		
	}

}
