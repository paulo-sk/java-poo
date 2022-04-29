package main.exercicio26;

import java.util.Scanner;

import models.exercicio26.Time;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Nome do primeiro time: ");
		String nomeTime1 = entrada.next();
		
		System.out.println("Numero de gols do primeiro time: ");
		int golsTime1 = entrada.nextInt();
		
		System.out.println("Nome do segundo time: ");
		String nomeTime2 = entrada.next();
		
		System.out.println("Numero de gols do segundo time: ");
		int golsTime2 = entrada.nextInt();
		
		
		Time time1 = new Time(nomeTime1, golsTime1);
		Time time2 = new Time(nomeTime2, golsTime2);
		
		Time.imprimirVencedor(time1, time2);

	}

}


