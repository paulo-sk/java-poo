package models.exercicio2;

public class Emprestimo {
	private Pessoa pessoa;
	
	public Emprestimo(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void imprimir() {
		System.out.println(pessoa);
	}
}
