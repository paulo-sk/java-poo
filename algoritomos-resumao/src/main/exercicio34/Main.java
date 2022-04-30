package main.exercicio34;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int anoAtual = 2022;
		
		System.out.println("Codigo Funcionario: ");
		String codigo = entrada.next();
		
		System.out.println("Ano de nascimento: ");
		int anoNascimento = entrada.nextInt();
		
		System.out.println("Ano em que entrou na empresa: ");
		int anoEntradaNaEmpresa = entrada.nextInt();
		
		int idade = anoAtual - anoNascimento;
		int tempoDeTrabalho = anoAtual - anoEntradaNaEmpresa;
		
		if(idade >= 65 && tempoDeTrabalho >= 25)
			System.out.println("Idade: "+idade+"\nTempo de trabalho: "+tempoDeTrabalho+"\nRequerer aposentadoria.");
		
		else if(idade >= 65)
			System.out.println("Idade: "+idade+"\nTempo de trabalho: "+tempoDeTrabalho+"\nRequerer aposentadoria.");
		
		else if(tempoDeTrabalho >= 30)
			System.out.println("Idade: "+idade+"\nTempo de trabalho: "+tempoDeTrabalho+"\nRequerer aposentadoria.");
		else
			System.out.println("Idade: "+idade+"\nTempo de trabalho: "+tempoDeTrabalho+"\nNao requerer.");
	}

}
