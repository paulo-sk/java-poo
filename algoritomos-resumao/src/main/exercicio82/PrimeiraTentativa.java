package main.exercicio82;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class PrimeiraTentativa {

	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>(5);
		for(int i = 0;  i < 5; i++) {
			lista.add(entrada.nextInt());
		}
		Collections.sort(lista); // ordena a lista em ordem alfab�tica.

		Map<Integer, Integer> cont = new TreeMap<Integer, Integer>();
		for (int repeticao : lista) {
			if (!cont.containsKey(repeticao))
			cont.put(repeticao, 0);
			cont.put(repeticao, cont.get(repeticao) + 1);
		}
		
		for (Entry<Integer, Integer> entry : cont.entrySet()) {
			if(entry.getValue() > 1)
				System.out.printf("\nNumero %s se repete %d vezes", entry.getKey(), entry.getValue());
		}

	}

}
