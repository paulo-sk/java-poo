package questionario7.exercicio1.models;

import java.util.ArrayList;

public class Bimestre {
	
	private String idBimestre;
	private ArrayList<Avaliacao> avaliacoes;

	public Bimestre(String idBimestre, ArrayList<Avaliacao> avaliacoes) {
		super();
		this.idBimestre = idBimestre;
		this.avaliacoes = avaliacoes;
	}

	public void imprimirAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		
		for(Avaliacao av: avaliacoes) {
			if(av instanceof Prova) {
				Prova prova = (Prova) av;
				System.out.println(prova);
				System.out.println("\n==================================");
			}
			
			if(av instanceof Seminario) {
				Seminario seminario = (Seminario) av;
				System.out.println(seminario);
				System.out.println("\n==================================");
			}
			
			if(av instanceof EstudoDirigido) {
				EstudoDirigido estudoDirigido = (EstudoDirigido) av;
				System.out.println(estudoDirigido);
				System.out.println("\n==================================");
			}
		}
	}

	public String getIdBimestre() {
		return idBimestre;
	}

	public void setIdBimestre(String idBimestre) {
		this.idBimestre = idBimestre;
	}

	public ArrayList<Avaliacao> getAvaliacao() {
		return avaliacoes;
	}

	public void setAvaliacao(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	

	
}
