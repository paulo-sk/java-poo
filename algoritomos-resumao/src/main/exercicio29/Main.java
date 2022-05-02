package main.exercicio29;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("idade do homem 1: ");
		int idadeHomem1 =  entrada.nextInt();
		
		System.out.println("idade do homem 2:");
		int idadeHomem2 = entrada.nextInt();
		
		System.out.println("idade mulher 1: ");
		int idadeMulher1 = entrada.nextInt();
		
		System.out.println("Idade mulher 2: ");
		int idadeMulher2 = entrada.nextInt();
		
		if(idadeHomem1 > idadeHomem2) {
			
			if(idadeMulher1 > idadeMulher2) {
				System.out.println("idade homem mais velho + idade mulher mais nova = "+(idadeHomem1 + idadeMulher2));
				System.out.println("Idade do homem mais novo * idade mulher mais velha: "+(idadeHomem2 * idadeMulher1));
			}
			else {
				System.out.println("idade homem mais velho + idade mulher mais nova = "+(idadeHomem1 + idadeMulher1));
				System.out.println("Idade do homem mais novo * idade mulher mais velha: "+(idadeHomem2 * idadeMulher2));
			}
		}
		
		
		else {
			if(idadeMulher1 > idadeMulher2) {
				System.out.println("idade homem mais velho + idade mulher mais nova = "+(idadeHomem2 + idadeMulher2));
				System.out.println("Idade do homem mais novo * idade mulher mais velha: "+(idadeHomem1 * idadeMulher1));
			}
			else {
				System.out.println("idade homem mais velho + idade mulher mais nova = "+(idadeHomem2 + idadeMulher1));
				System.out.println("Idade do homem mais novo * idade mulher mais velha: "+(idadeHomem1 * idadeMulher2));
			}
		}
	}
		
		
}

