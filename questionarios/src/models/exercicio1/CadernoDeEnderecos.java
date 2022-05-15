package models.exercicio1;

public class CadernoDeEnderecos {
	
	private Pessoa[] pessoas;

	public CadernoDeEnderecos() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa[] getPessoas() {
		if(pessoas == null)
			pessoas = new Pessoa[2];
		return pessoas;
	}
	
}
