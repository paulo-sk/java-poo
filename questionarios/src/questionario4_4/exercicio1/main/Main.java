package questionario4_4.exercicio1.main;

import java.util.Scanner;

import questionario4_4.exercicio1.models.ContadorDePessoas;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("===========REGISTRO DE PESSOAS NO RESTAURANTE===========");
		
		System.out.println("\nDigite o limite de pessoas no restaurante.");
		int limite = entrada.nextInt();
		
		ContadorDePessoas contador = new ContadorDePessoas(limite);
		String opcao;
		do {
			
			System.out.println("1 - REGISTRAR ENTRADA");
			System.out.println("2 - REGISTRAR SAIDA");
			System.out.println("3 - MOSTRAR RELATORIO E ENCERRAR");
			opcao = entrada.next();
			
			switch (opcao) {

			case "1":
				System.out.println("Quantidade: ");
				contador.registraEntrada(entrada.nextInt());
				break;

			case "2":
				System.out.println("Quantidade: ");
				contador.registraSaida(entrada.nextInt());
				break;

			default:
				if(!opcao.contentEquals("3"))
					System.out.println("Opcao invalida.");
			}
			
			
		}while(!opcao.equals("3"));
		
		contador.mostrarRelatorio();

	}

}
