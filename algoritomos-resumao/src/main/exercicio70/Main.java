package main.exercicio70;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.print("Quantos alunos? ");
		int quantidadeAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas? ");
		int quantidadeNotas = entrada.nextInt();
		
		double[][] boletim = new double[quantidadeAlunos][quantidadeNotas];
		double somaNotasAluno= 0;
		double[] mediaAluno = new double[quantidadeAlunos];
		double mediaSala = 0;
		
		//recebendo nota de cada materia de cada aluno
		for(int i = 0; i < quantidadeAlunos; i++) {
			for(int j = 0; j < quantidadeNotas; j++) {
				System.out.print("Digite a "+(j+1)+"º nota para o aluno "+(i+1)+": ");
				double nota = entrada.nextDouble();
				boletim[i][j] = nota;
			}
				
		}
		
		//mostrando notas e media de cada aluno
		for(int i = 0; i < quantidadeAlunos; i++) {
			System.out.print("\nnotas do aluno "+(i+1)+": ");
			for(int j = 0; j < quantidadeNotas; j++) {
				somaNotasAluno += boletim[i][j];
				
				if(j == (quantidadeNotas - 1)) {
					System.out.print(boletim[i][j]);
					mediaAluno[i] += somaNotasAluno/quantidadeNotas;
					System.out.printf(" ||| media: %.2f", (mediaAluno[i]));
					somaNotasAluno = 0;
					mediaSala += mediaAluno[i];
				}
				else
					System.out.print(boletim[i][j]+", ");
			}
			
		}
		
		mediaSala /= quantidadeAlunos; 
		
		//media da sala
		System.out.printf("\n\nMedia da sala: %.2f", mediaSala);
		int count = 0;
		for(int i = 0; i < mediaAluno.length; i++) {
			if(mediaAluno[i]> mediaSala) {
				System.out.println("\nO aluno "+(i+1)+" esta acima da media, com uma media de "+mediaAluno[i]);
				count++;
			}
		}
		
		System.out.println("Alunos acima da media: "+count);
		

	}

}
