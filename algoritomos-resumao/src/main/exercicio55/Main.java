package main.exercicio55;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		int somaMenosDe40 = 0;
		for(int i = 0; i < 10; i++) {
			int n = entrada.nextInt();
			if(n < 40)
				somaMenosDe40 +=n;
		}
		System.out.println("Soma: "+somaMenosDe40);

	}

}
