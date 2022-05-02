package main.exercicio48;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// Reescreva o exercício 50 utilizando a estrutura REPITA e um CONTADOR
		//vou supor que ele quis dizer exercicio 46, pois ainda nem chegamos ao 50
		
		int i = 1;
		do {
			System.out.println("8 x "+i+" = "+(8*i));
			i++;
		}
		while(i <= 10);
	}

}
