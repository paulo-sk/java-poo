package main;

import models.CadernoDeEnderecos;
import models.Endereco;
import models.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("neo", "61 887770112", "neo@gmail.com");
		pessoa1.setEndereco(new Endereco("721245488", "bairro brooklyn", "rua 12"));
		
		Pessoa pessoa2 = new Pessoa("morpheus", "81 8237421", "morf@gmail.com");
		pessoa2.setEndereco(new Endereco("721245488", "bairro Bhills", "rua 114"));
		
		CadernoDeEnderecos cadernoEndereco = new CadernoDeEnderecos();
		cadernoEndereco.getPessoas()[0] = pessoa1;
		cadernoEndereco.getPessoas()[1] = pessoa2;
		
		
		for(Pessoa pessoaTemp: cadernoEndereco.getPessoas()) {
			pessoaTemp.imprime();
		}
		

	}

}
