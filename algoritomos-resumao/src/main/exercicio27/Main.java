package main.exercicio27;
import java.util.Scanner;

public class Main {
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int valor1 = getValor(entrada);
		int valor2 = getValor(entrada);
		
		checarValores(valor1, valor2);
	}
	
	public static int getValor(Scanner scan) {
		System.out.println("Entre com um valor:");
		return scan.nextInt();
	}
	
	public static void checarValores(int valor1, int valor2) {
		if(valor1 == valor2) {
			System.out.println("Numeros iguais.");
		}
		
		else if(valor1 > valor2) {
			System.out.println("Valor 1 é maior.");
		}
		
		else {
			System.out.println("Valor 2 é maior.");
		}
	}

}
