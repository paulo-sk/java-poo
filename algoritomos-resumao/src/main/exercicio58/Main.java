package main.exercicio58;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int media = 0;
		for(int i = 15; i<= 100; i++) {
			media +=i;
		}
		media /= (100 - 15);
		System.out.println("Media: "+media);

	}

}
