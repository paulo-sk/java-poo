package main.exercicio82;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solucao1 {
	public static Scanner ler = new Scanner(System.in);
	
    public static void main(String[] args) {
        
        
        int[] valores = new int[5];
        
        for(int i = 0; i < valores.length; i++){
            System.out.printf("Informe o valor " + (i+1) + ": \n");
            valores[i] = ler.nextInt();
        }
        
        int[] valoresNaoRepetidos = Arrays.stream(valores).distinct().toArray();
  
        /*O array list é para dizer quantas vezes se repete (usando o size() da lista
         * e tambem para dizer em quais posicoes se repetem com add(index)*/
        ArrayList<Integer> posicoes = new ArrayList<Integer>();
        
        /*a comparacao e feita com cada valor do array sem numeros repetidos com o array
         * com todos os numeros */
        for(int i = 0; i < valoresNaoRepetidos.length; i++) {
        	for(int j = 0; j < valores.length; j++) {
        		
        		if(valoresNaoRepetidos[i] == valores[j]) {
        			posicoes.add(j);
        		}
        	}
        	if(posicoes.size() > 1) {
        		System.out.println("O numero "+valoresNaoRepetidos[i]+
        		" se repete "+posicoes.size()+" vezes nas posicoes: "+posicoes);
        	}
        	posicoes.clear();
        
        }

    }
}