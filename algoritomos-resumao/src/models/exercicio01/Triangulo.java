package models.exercicio01;

public class Triangulo {
	
	 private int lado1;
	 private int lado2;
	 private int lado3;
	
	public Triangulo(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public int calcularPerimetro() {
		return this.lado1 + this.lado2 + this.lado3;
	}
	
	
}
