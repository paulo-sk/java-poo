package main.exercicio64;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		double mediaSalario = 0;
		double mediaFilhos = 0;
		double maiorSalario = 0;
		double salarioMenorQue150 = 0;
		
		int count = 0;
		
		while(true) {
			
			System.out.println("Salario do habitante "+(count+1)+": ");
			double salario = entrada.nextDouble();
			if(salario < 0)
				break;
			
			mediaSalario += salario;
			
			if(salario > maiorSalario)
				maiorSalario = salario;
			
			if(salario < 150)
				salarioMenorQue150++;
			
			System.out.println("Quantos filhos tem o habitante "+(count+1)+": ");
			int filhos = entrada.nextInt();
			mediaFilhos += filhos;
			
			count++;
		}
		
		mediaSalario /= count;
		mediaFilhos /= count;
		salarioMenorQue150 = salarioMenorQue150 / (count); 
		
		System.out.println("Media salarial: R$"+mediaSalario);
		System.out.println("Media de filhos: "+mediaFilhos);
		System.out.println("Maior salario: R$"+maiorSalario);
		System.out.println("Percentual de pessoas que ganhar menos de R$150,00: "+(salarioMenorQue150*100)+"%.");
		
	}

}
