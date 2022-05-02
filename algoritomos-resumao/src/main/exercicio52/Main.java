package main.exercicio52;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		double media = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o"+i+"º numero: ");
			int n = entrada.nextInt();
			media += n;
		}
		media /= 10;
		System.out.println("Media dos numeros digitados: "+media);

	}
	
}
