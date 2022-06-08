package questionario9_revisao.exercicio1.main;

import java.util.Calendar;

import questionario9_revisao.exercicio1.model.Jogador;

public class Main {

	public static void main(String[] args) {

		Jogador jogador = new Jogador("Cr7", "atacante", "portuguesa", 1.85, 75);

		Calendar nascimento = Calendar.getInstance();

		nascimento.set(1985, 3, 26);

		jogador.setAnoDeNascimento(nascimento);

		System.out.println(jogador);

	}

}
