package main.exercicio20;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
/*Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e quantidade
m�nima em estoque de um produto. Calcular e escrever a quantidade m�dia ((quantidade m�dia =
quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual a quantidade
m�dia escrever a mensagem 'N�o efetuar compra', sen�o escrever a mensagem 'Efetuar compra'*/
	static double quantidadeAtual;
	static double quantidadeMaxima;
	static double quantidadeMinima;
	static double quantidadeMedia;
	
	public static void main(String[] args) {
		System.out.println("Digite a quantidade atual em estoque: ");
		quantidadeAtual = entrada.nextDouble();
		
		System.out.println("Digite a quantidade maxima em estoque: ");
		quantidadeMaxima = entrada.nextDouble();
		
		System.out.println("Digite a quantidade minima em estoque: ");
		quantidadeMinima = entrada.nextDouble();
		
		quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;
		
		if(quantidadeAtual >= quantidadeMedia) 
			System.out.println("N�o efetuar compra.");
		
		else
			System.out.println("Efetuar compra agora.");
		
	}
	
	

}
