package lista4_3.exercicio1.models;

public class Mensagem {
	
	private String texto;
	
	public Mensagem(String texto) {
		this.texto = texto;
	}
	
	public void escrever() {
		System.out.println(this.texto);
	}
}
