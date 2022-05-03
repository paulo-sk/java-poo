package main.exercicio82;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Solucao2 {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
		    numeros.add(entrada.nextInt());
		}

		//mapeia cada inteiro para uma lista com as posicoes em que o mesmo aparece.
		Map<Integer, List<Integer>> cont = new LinkedHashMap<>();
		for (int i = 0; i < numeros.size(); i++) {
		    int n = numeros.get(i);
		    if (!cont.containsKey(n)) {
		        cont.put(n, new ArrayList<>());
		    }
		    // adiciona "i" na lista de posições em que o número aparece
		    cont.get(n).add(i);
		}

		for (Entry<Integer, List<Integer>> entry : cont.entrySet()) {
		    List<Integer> posicoes = entry.getValue();
		    if (posicoes.size() > 1) {
		        System.out.printf("Número %d se repete %d vezes nas posições: %s\n", entry.getKey(), posicoes.size(), posicoes);
		    }
		}

	}

}
