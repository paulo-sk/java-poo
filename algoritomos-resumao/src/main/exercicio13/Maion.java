package main.exercicio13;

import java.util.Scanner;

public class Maion {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite seu ano de nascimento: ");
		int anoNascimento = entrada.nextInt();
		
		System.out.println("Digite o ano atual:");
		int anoAtual = entrada.nextInt();
		
		if(anoAtual - anoNascimento >= 16)
			System.out.println("Ja pode votar este ano.");
		else
			System.out.println("Não pode votar esse ano.");
		
	}

}
