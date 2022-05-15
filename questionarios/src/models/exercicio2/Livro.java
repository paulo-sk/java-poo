package models.exercicio2;

public class Livro {
	
	private String titulo;
	private int anoLancamento;
	private String id;
	
	public Livro(String titulo, int anoLancamento, String id) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.id = id;
	}
	
	public void print() {
		System.out.println("Titulo: "+this.titulo);
		System.out.println("Ano de lancamento: "+this.anoLancamento);
		System.out.println("ID: "+this.id);
		
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", anoLancamento=" + anoLancamento + ", id=" + id + "]";
	}

	
}
