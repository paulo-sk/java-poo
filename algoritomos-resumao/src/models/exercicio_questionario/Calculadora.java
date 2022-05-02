package models.exercicio_questionario;

public class Calculadora {
	private double valor1;
	private double valor2;
	private double valor3;
	
	public Calculadora(double valor1) {
		this.valor1 = valor1;
	}
	
	public Calculadora(double valor1, double valor2) {
		this(valor1);
		this.valor2 = valor2;

	}
	
	public Calculadora(double valor1, double valor2, double valor3) {
		this(valor1, valor2);
		this.valor3 = valor3;
	}
	
	//usei 2 valores, pois 3 valores nao faz sentido pra mim, na subtracao ou divisao
	public double soma() {
		return this.valor1 + this.valor2;
	} 
	
	public double subtracao() {
		return this.valor1 - this.valor2;
	} 
	
	public double divisao() {
		return this.valor1 / this.valor2;
	} 
	
	public double multiplicacao() {
		return this.valor1 * this.valor2;
	} 
	
}
