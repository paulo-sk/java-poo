package main.exercicio76;

import java.util.Scanner;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];
		double menorTemperatura = Double.MAX_VALUE;
		double maiorTemperatura = Double.MIN_VALUE;
		double mediaAnual = 0;
		int diasComMediaInferior = 0;
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("Temperatura do dia "+(i+1));
			temperaturas[i] = entrada.nextDouble();
			
			if(temperaturas[i]> maiorTemperatura)
				maiorTemperatura = temperaturas[i];
			
			if(temperaturas[i] < menorTemperatura)
				menorTemperatura = temperaturas[i];
			
			mediaAnual += temperaturas[i];
		}
		
		mediaAnual /= temperaturas.length;
		
		for(int i = 0; i < temperaturas.length; i++) {
			if(temperaturas[i] < mediaAnual)
				diasComMediaInferior++;
		}
		
		System.out.println("Menor temperatura do ano: "+menorTemperatura);
		System.out.println("Maior temperatura do ano: "+maiorTemperatura);
		System.out.println("Media de temperatura do ano: "+mediaAnual);
		System.out.println("Dias com temperatura inferior a media: "+diasComMediaInferior+" dias.");

	}

}
