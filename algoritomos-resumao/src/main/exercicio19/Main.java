package main.exercicio19;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Numero da conta: ");
		String numeroConta = entrada.next();
		
		System.out.println("Saldo da conta: ");
		double saldo = entrada.nextDouble();
		
		System.out.println("Debito da conta: ");
		double debito = entrada.nextDouble();
		
		System.out.println("Credito da conta: ");
		double credito = entrada.nextDouble();
		
		saldo = (saldo - debito) + credito; 
		
		if(saldo < 0)
			System.out.println("Saldo atual: R$"+saldo+", negativo.");
		else
			System.out.println("Saldo atual: R$"+saldo+", positivo.");
		
		

	}

}
