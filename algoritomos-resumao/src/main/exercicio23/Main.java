package main.exercicio23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println("Digite os numeros: ");
		al.add(entrada.nextInt());
		al.add(entrada.nextInt());
		al.add(entrada.nextInt());
		System.out.println(al);

		int max1 = Collections.max(al);
		System.out.println("O maior numero digitado: " + max1);
		al.remove(al.indexOf(max1));

		int max2 = Collections.max(al);
		System.out.println("O segundo maior nuemro digitado: "+max2);
		
		System.out.println("Soma dos 2 maiores numeros: "+(max1+max2));
		
	}

}
