package models;

public class Lampada {
	public String modelo;
	public String fornecedor;
	public float preco;
	public long codigoBarras;
	
	public void imprimir() {
		
	}
	
	public void ligar() {
		System.out.println("LIGADO");
	}
	
	public void desligar() {
		System.out.println("DESLIGADA");
	}
}
