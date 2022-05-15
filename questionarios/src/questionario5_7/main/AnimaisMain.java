package questionario5_7.main;

import questionario5_7.models.Mamifero;
import questionario5_7.models.Peixe;

public class AnimaisMain {

	public static void main(String[] args) {
		Mamifero camelo = new Mamifero("Camelo", "Amarelo", 4, "Carnívoro");
		Peixe tubarao = new Peixe("Tubarao", "Cinzento", 0);
		Mamifero ursoDoCanada = new Mamifero("Urso-do-canadá", "Vermelho", 4, "Mel");
		
		camelo.dadosMamifero();
		System.out.println("===========================================");
		tubarao.dadosAnimal();
		System.out.println("===========================================");
		ursoDoCanada.dadosMamifero();
	}

}
