package main.exercicio04;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite a idade do sujeito: ");
		int idade = entrada.nextInt();
		
		if(idade >= 18) {
			System.out.println("Maior de idade.");
		}
		else
			System.out.println("Menor de idade.");
	}

}
