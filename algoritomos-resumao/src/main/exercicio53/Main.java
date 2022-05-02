package main.exercicio53;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Quantos alunos?");
		int nAlunos = entrada.nextInt();
		
		System.out.println("Quantas materias?");
		int nMaterias = entrada.nextInt();
		
		double[][] notas = new double[nAlunos][nMaterias];
		double somaNotas = 0;
		
		//entrada de dados para nota
		for(int i = 0; i < nAlunos; i++) {
			for(int j = 0; j < nMaterias; j++) {
				System.out.print("\nDigite a "+(j+1)+"º nota do aluno "+(i+1)+":");
				notas[i][j] = entrada.nextDouble();
			}
		}
		
		//calcular e mostrar media
		for(int i = 0; i < nAlunos; i++) {
			for(int j = 0; j < nMaterias; j++) {
				somaNotas += notas[i][j];
			}
			System.out.println("Media do aluno "+(i+1)+" > "+(somaNotas/nMaterias));
			somaNotas = 0;
		}

	}

}
