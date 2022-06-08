package questionario9_revisao.exercicio2.main;

import java.util.Scanner;

import questionario9_revisao.exercicio2.model.Elevador;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("===========ELEVADOR===========");
		
		System.out.println("\nTotal de andares: ");
		int totalAndares = entrada.nextInt();
		
		System.out.println("\nCapacidade do elevador: ");
		int capacidadeElevador = entrada.nextInt();
		
		Elevador elevador = new Elevador(totalAndares, capacidadeElevador);
		
		String opcao;
		
		do {
			
			System.out.println("\n1 - REGISTRAR ENTRADA");
			System.out.println("2 - REGISTRAR SAIDA");
			System.out.println("3 - SUBIR ANDAR");
			System.out.println("4 - DESCER ANDAR");
			System.out.println("5 - RELATORIO");
			System.out.println("X - ENCECERRAR");
			opcao = entrada.next();
			
			switch (opcao) {

			case "1":
				System.out.println("Quantidade: ");
				elevador.entrar(entrada.nextInt());
				break;

			case "2":
				System.out.println("Quantidade: ");
				elevador.sair(entrada.nextInt());
				break;
				
			case "3":
				System.out.println("quantos andares? ");
				elevador.subir(entrada.nextInt());
				break;
				
			case "4":
				System.out.println("quantos andares? ");
				elevador.descer(entrada.nextInt());
				break;
			
			case "5":
				System.out.println(elevador);
				break;

			default:
				if(!opcao.equalsIgnoreCase("x"))
					System.out.println("Opcao invalida.");
			}
			
			
		}while(!opcao.equalsIgnoreCase("x"));
		
		System.out.println("\nFim.");
		

	}


}
