package main.exercicio09;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite um valor: ");
		int valor = entrada.nextInt();
		
		if(valor > 10)
			System.out.println("� MAIOR QUE 10!");
		else
			System.out.println("N�O � MAIOR QUE 10!");
	}

}
