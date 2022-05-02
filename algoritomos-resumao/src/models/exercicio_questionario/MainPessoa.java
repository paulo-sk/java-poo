package models.exercicio_questionario;

import java.util.Scanner;

public class MainPessoa {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("====================ENDEREÇO====================");
		
		System.out.println("Logradouro: ");
		String logradouro = entrada.nextLine();
		
		System.out.println("Numero: ");
		String numero = entrada.nextLine();
		
		System.out.println("Complemento: ");
		String complemento = entrada.nextLine();
		
		System.out.println("Bairro: ");
		String bairro = entrada.nextLine();
		
		System.out.println("Cidade: ");
		String cidade = entrada.nextLine();
		
		System.out.println("Cep: ");
		String cep = entrada.nextLine();
		
		Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
		
		System.out.println("Nome da pessoa: ");
		String nome = entrada.nextLine();
		
		System.out.println("cpf: ");
		String cpf = entrada.nextLine();
		
		Pessoa pessoa = new Pessoa(nome, cpf, endereco);
		
		System.out.println(pessoa);

	}

}
