package main.exercicio31;

import java.util.Scanner;

public class Main {

	private static String usuario = "1234";
	private static String senha = "9999";
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println(acesso(Main.usuario, Main.senha));
	}
	
	
	
	public static String acesso(String usuario, String senha) {
		
		System.out.println("Digite o codigo do usuario: ");
		String usuarioEntrada = entrada.next();
		
		if(usuarioEntrada.equals(Main.usuario)) {
			System.out.println("Digite a senha: ");
			String senhaEntrada = entrada.next();
			
			if(senhaEntrada.equals(Main.senha)) {
				return "Acesso permitido.";
			}
			return "senha incorreta";
		}
		return "Usuario invalido!";
		
	}

}
