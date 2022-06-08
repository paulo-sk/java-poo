package questionario7.exercicio1.main;

import java.util.ArrayList;

import questionario7.exercicio1.models.Avaliacao;
import questionario7.exercicio1.models.Bimestre;
import questionario7.exercicio1.models.EstudoDirigido;
import questionario7.exercicio1.models.Prova;
import questionario7.exercicio1.models.Seminario;

public class BimestreTestMain {

	public static void main(String[] args) {
		
		//nome de tema do seminario e estudo dirigido coloquei igual ao nome.
		Prova prova = new Prova("algebra linear", 9, 2.5, 10, false);
		Seminario seminario = new Seminario("estrutura de dados", 8, "estrutura de dados", 3);
		EstudoDirigido estudoDirigido = new EstudoDirigido("Algoritmos", 9.7, "Algoritmos", 2);
		
		ArrayList<Avaliacao> av = new ArrayList<Avaliacao>();
		av.add(prova);
		av.add(seminario);
		av.add(estudoDirigido);
		
		Bimestre bimestre = new Bimestre("2ºBimestre", av);
		bimestre.imprimirAvaliacoes(av);

	}

}
