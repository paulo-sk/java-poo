package lista4_3.exercicio3.models;

import java.util.ArrayList;
import java.util.Collections;

public class Ordem {
	private double x;
	private double y;
	private double z;
	
	public Ordem(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	public void mostrarMaior() {
		ArrayList<Double> n = new ArrayList<>();
		n.add(x);
		n.add(y);
		n.add(z);
		System.out.println("Maior valor: "+Collections.max(n));
	}
	
	public void mostrarMenor() {
		ArrayList<Double> n = new ArrayList<>();
		n.add(x);
		n.add(y);
		n.add(z);
		System.out.println("Menor valor: "+Collections.min(n));
	}
	
	public void mostrarCrescente() {
		ArrayList<Double> n = new ArrayList<>();
		n.add(x);
		n.add(y);
		n.add(z);
		Collections.sort(n);
		System.out.println("Crescente: "+n);
	}
	
	public void mostrarDecrescente() {
		ArrayList<Double> n = new ArrayList<>();
		n.add(x);
		n.add(y);
		n.add(z);
		Collections.sort(n);
		Collections.reverse(n);
		System.out.println("Crescente: "+n);
		
	}
}
