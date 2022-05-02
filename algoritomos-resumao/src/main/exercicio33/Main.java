package main.exercicio33;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//entrada.useLocale(Locale.US); caso queira colocar as entradas de double com ponto(.) ao inves de virgula(,)
		
		System.out.println("Nota 1: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Nota 2: ");
		double nota2 = entrada.nextDouble();
		
		System.out.println("Nota 3: ");
		double nota3 = entrada.nextDouble();
		
		System.out.println("Media dos exercicios: ");
		double mediaExercicios = entrada.nextDouble();
		
		double mediaAproveitamento = ((nota1 +nota2*2 + nota3*3) + mediaExercicios) / 6;
		
		if(mediaAproveitamento >= 9)
			System.out.println("conceito do aluno: A.");
		
		else if(mediaAproveitamento >= 7.5 && mediaAproveitamento < 9)
			System.out.println("conceito do aluno: B.");
		
		else if(mediaAproveitamento >= 6 && mediaAproveitamento < 7.5)
			System.out.println("conceito do aluno: C.");
		
		else
			System.out.println("conceito do aluno: D.");
	}

}
