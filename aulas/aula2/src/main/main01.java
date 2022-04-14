package main;

import models.Lampada;

public class main01 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.modelo = "LED";
		lampada.fornecedor = "Eletrolux";
		lampada.preco = 10.5F;
		lampada.codigoBarras = 1243245231341L;
		
		lampada.imprimir();
		lampada.desligar();
		lampada.desligar();
	}

}
