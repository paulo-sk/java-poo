package lista4_3.exercicio2.main;

import java.util.Scanner;

import lista4_3.exercicio2.models.Aluno;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nome do aluno: ");
		String nome = entrada.nextLine();
		
		
		System.out.println("Nota final: ");
		float notaFinal = entrada.nextFloat();
		
		System.out.println("Nome do disciplina: ");
		String disciplina = entrada.next();
		
	
		
		Aluno aluno = new Aluno(nome, notaFinal, disciplina);
		aluno.mostrarAluno();
		aluno.situacao();
	}

}
