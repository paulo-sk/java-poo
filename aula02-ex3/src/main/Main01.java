package main;

import models.Agenda;
import models.Contato;

public class Main01 {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda(); 
		
		agenda.nome = "Agenda pessoal";
		agenda.quantidadeContato = 1;
		
		agenda.contato = new Contato();
		agenda.contato.nome = "Edilson";
		agenda.contato.numeroTelefone = "61 99922093";
		agenda.contato.email = "edilson@gmai.com";
		agenda.contato.facebook = "@edilson13";
		
		agenda.contato.imprimir();
		
		
	}

}
