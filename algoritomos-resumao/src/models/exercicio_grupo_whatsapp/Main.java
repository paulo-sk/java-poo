package models.exercicio_grupo_whatsapp;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	
		/*faca um programa que calcula o boletim escolar de um aluno, utilizando array.
		 * devera armazenar as notas de 10 alunos em 5 materias.
		 * ao final, devera exibir as notas e media do aluno e a media da sala 
		 * para cada uma das materias
		 * */
		System.out.print("Quantos alunos? ");
		int quantidadeAlunos = entrada.nextInt();
		
		System.out.print("Quantas materias? ");
		int quantidadeMateria = entrada.nextInt();
		
		double[][] boletim = new double[quantidadeAlunos][quantidadeMateria];
		double[] somaNotasAluno= new double[quantidadeAlunos];
		double[] somaNotaDeCadaMateria = new double[quantidadeMateria];
		
		//recebendo nota de cada materia de cada aluno
		for(int i = 0; i < quantidadeAlunos; i++) {
			for(int j = 0; j < quantidadeMateria; j++) {
				System.out.print("Digite a nota da "+(j+1)+"º materia para o aluno "+(i+1)+": ");
				double nota = entrada.nextDouble();
				boletim[i][j] = nota;
			}
				
		}
		
		//mostrando notas e media de cada aluno
		for(int i = 0; i < quantidadeAlunos; i++) {
			System.out.print("\nnotas do aluno "+(i+1)+": ");
			for(int j = 0; j < quantidadeMateria; j++) {
				somaNotasAluno[i] += boletim[i][j];
				if(j== (boletim[0].length - 1)) {
					System.out.print(boletim[i][j]);
					System.out.print(" ||| media: "+(somaNotasAluno[i]/quantidadeMateria));
				}
				else
					System.out.print(boletim[i][j]+", ");
			}
			
		}
		
		//media em cada materia da sala
		for(int i = 0; i < quantidadeMateria; i++) {
			for(int j = 0; j < quantidadeAlunos; j++) {
				somaNotaDeCadaMateria[i] += boletim[j][i]; 
			}
		}
		
		System.out.println("\n\n============== Media da sala em cada Matéria ==============");
		
		for(int i = 0; i < somaNotaDeCadaMateria.length; i++) {
			System.out.println("Media na materia "+(i+1)+": " +(somaNotaDeCadaMateria[i]/boletim.length));
		}
		

	}

}
