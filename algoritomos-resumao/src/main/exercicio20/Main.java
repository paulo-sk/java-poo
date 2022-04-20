package main.exercicio20;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
/*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade
mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade média =
quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade
média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'*/
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
			System.out.println("Não efetuar compra.");
		
		else
			System.out.println("Efetuar compra agora.");
		
	}
	
	

}
