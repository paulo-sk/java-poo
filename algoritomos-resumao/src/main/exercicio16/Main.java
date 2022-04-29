package main.exercicio16;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Hora do inicio do jogo: ");
		int horaInicio = entrada.nextInt();
		
		System.out.println("Hora do fim do jogo: ");
		int horaFim = entrada.nextInt();
		
		if(horaFim < horaInicio) {
			System.out.println("Duracao do jogo: "+((24 - horaInicio) + horaFim)+" horas.");
		}
			
		
		else
			System.out.println("Duracao do jogo: "+(horaFim - horaInicio)+" horas. ");

	}

}
