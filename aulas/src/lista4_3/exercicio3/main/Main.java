package lista4_3.exercicio3.main;

import java.util.Scanner;

import lista4_3.exercicio3.models.Ordem;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Valor 1: ");
		double v1 = entrada.nextDouble();
		
		System.out.println("Valor 2: ");
		double v2 = entrada.nextDouble();
		
		System.out.println("Valor 3: ");
		double v3 = entrada.nextDouble();
		
		Ordem ordem = new Ordem(v1, v2, v3);
		ordem.mostrarMaior();
		ordem.mostrarMenor();
		ordem.mostrarCrescente();
		ordem.mostrarDecrescente();

	}

}
