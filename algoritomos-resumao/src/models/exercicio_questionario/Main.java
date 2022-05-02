package models.exercicio_questionario;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		//usarei 2 valores para essa calculadora, pois se for 3 valores nao vai fazer sentido.
		
		System.out.println("Digite o primeiro valor: ");
		double primeiroValor = entrada.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double segundoValor = entrada.nextDouble();
		
		Calculadora calculadora = new Calculadora(primeiroValor,segundoValor);
		
		System.out.println("Soma: "+calculadora.soma());
		System.out.println("Subtracao: "+calculadora.subtracao());
		System.out.printf("Divisao: %.2f\n", calculadora.divisao());
		System.out.println("Multiplicacao: "+calculadora.multiplicacao());

	}

}
