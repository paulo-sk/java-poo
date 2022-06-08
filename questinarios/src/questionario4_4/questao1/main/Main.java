package questionario4_4.questao1.main;

import java.util.Scanner;

import questionario4_4.questao1.models.ContadorDePessoas;

public class Main {
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("================REGISTRO DE PESSOAS NO RESTAURANTE================");
		
		System.out.println("\n\nDigite o limite de pessoas no restaurant: ");
		int limite = entrada.nextInt();
		
		ContadorDePessoas contador = new ContadorDePessoas(limite);
		String opcao;
		
		do {
			System.out.println("\n\"Esclhora a opcao 3 (relatorio) para encerrar o programa.\"");
			
			System.out.println("1 - REGISTRAR ENTRADA ");
			System.out.println("2 - REGISTRAR SAIDA ");
			System.out.println("3 - RELATORIO DO DIA ");
			opcao = entrada.next();
			
			
			switch(opcao) {
			
			  case "1":
			    System.out.println("Quantidade: ");
			    contador.registraEntrada(entrada.nextInt());
			    break;
			    
			  case "2":
				  System.out.println("Quantidade: ");
				    contador.registraSaida(entrada.nextInt());
			    break;
				    
			  default:
				  if(!opcao.equals("3"))
					  System.out.println("Opcao invalida, digite umas das opcoes (1,2 ou 3.");
			}
		}while(!opcao.equals("3"));
		
		contador.mostrarRelatorio();

	}

}
