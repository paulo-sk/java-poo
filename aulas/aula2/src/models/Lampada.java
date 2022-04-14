package models;

public class Lampada {
	public String modelo;
	public String fornecedor;
	public float preco;
	public long codigoBarras;
	
	public void imprimir() {
		System.out.println("modelo: "+ modelo);
		System.out.println("fornecedor: "+fornecedor);
		System.out.println("preco: "+preco);
		System.out.println("codigoBarras: "+ codigoBarras);

	}
	
	public void ligar() {
		System.out.println("LIGADO");
	}
	
	public void desligar() {
		System.out.println("DESLIGADA");
	}
}
