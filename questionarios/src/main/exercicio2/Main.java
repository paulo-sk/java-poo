package main.exercicio2;

import models.exercicio2.Emprestimo;
import models.exercicio2.Livro;
import models.exercicio2.Pessoa;

public class Main {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Deep work", 2016, "#1337");
		Pessoa pessoa1 = new Pessoa("Akira", "555999888", livro1);
		Emprestimo emprestimo1 = new Emprestimo(pessoa1);
		
		emprestimo1.imprimir();
		
	}

}
