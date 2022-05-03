package main.exercicio82;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CodigoExemplo {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>(8);
		lista.add("Adao-Bastos");
		lista.add("Ana-Costa");
		lista.add("Filipe-Celso");
		lista.add("Ana-Costa");
		lista.add("Ana-Costa");
		lista.add("Filipe-Celso");
		lista.add("Doroteia-Paulo");
		lista.add("Filipe-Celso");
		lista.add("Adao-Bastos");
		Collections.sort(lista); // ordena a lista em ordem alfab�tica.

		Map<String, Integer> cont = new TreeMap<String, Integer>();
		for (String nome : lista) {
		if (!cont.containsKey(nome))
		cont.put(nome, 0);
		cont.put(nome, cont.get(nome) + 1);
		}

		for (Map.Entry<String, Integer> entry : cont.entrySet()) {
		System.out.printf("%s => %d%n", entry.getKey(), entry.getValue());
		}

	}

}
