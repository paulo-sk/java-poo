package main.exercicio11;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Quantas macas vc deseja?");
		int quantidadeMacas = entrada.nextInt();
		
		if(quantidadeMacas >= 12) {
			System.out.println("Custo total da compra: R$"+(quantidadeMacas * 1));
		}
		else
			System.out.println("Custo totaal da compra: R$"+(quantidadeMacas * 1.30));
	}

}
