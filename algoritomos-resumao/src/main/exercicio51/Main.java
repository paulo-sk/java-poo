package main.exercicio51;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int intervalo10a20 = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Digite o"+i+"º numero: ");
			int n = entrada.nextInt();
			if(n >= 10 && n <=20)
				intervalo10a20++;
		}
		System.out.println("Foram digitados "+intervalo10a20+" numeros no intervalo [10,20] e "
		+(10 - intervalo10a20)+" numeros fora do intervalo.");

	}

}
