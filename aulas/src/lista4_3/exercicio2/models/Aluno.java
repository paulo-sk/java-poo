package lista4_3.exercicio2.models;

public class Aluno {
	private String nome;
	private float notaFinal;
	private String disciplina;
	
	public Aluno(String nome, float notaFinal, String disciplina) {
		this.nome = nome;
		this.notaFinal = notaFinal;
		this.disciplina = disciplina;
	}
	
	public void mostrarAluno() {
		System.out.println("Aluno: "+this.nome);
		System.out.println("disciplina: "+this.disciplina);
		System.out.println("Nota final: "+this.notaFinal);
	}
	
	public void situacao() {
		if(notaFinal > 6) {
			System.out.println("Aprovado.");
			return;
		}
		System.out.println("Reprovado.");
		return;
	
	}
}
