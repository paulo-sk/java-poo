package questionario5_7.main;


import questionario5_7.models.Mamifero;

public class AnimalMain {
	
	public static void main(String[] args) {
		Mamifero gato = new Mamifero("Gato", "Branco", 4, "Carnívoro");
		Mamifero elefante = new Mamifero("elefante", "Cinza", 4, "herbívoro");
		
		gato.dadosMamifero();
		System.out.println("==================================");
		elefante.dadosMamifero();
			
	}

}

