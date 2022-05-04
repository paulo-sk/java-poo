package lista4_3.exercicio1.main;

import java.util.Scanner;

import lista4_3.exercicio1.models.Mensagem;

public class Main {
	
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		Mensagem mensagem = new Mensagem(entrada.nextLine());
		mensagem.escrever();
	}

}
