package models.exercicio26;

public class Time {
	
	private String nome;
	private int gols;
	
	public Time(String nome, int gols) {
		this.nome = nome;
		this.gols = gols;
	}
	
	public static void imprimirVencedor(Time time1, Time time2) {
		if(time1.gols > time2.gols)
			System.out.println("Time do "+time1.getNome() +" venceu por "+ time1.getGols()+ " a "+time2.getGols()+".");
		
		else if(time2.gols > time1.gols)
			System.out.println("Time do "+time2.getNome() +" venceu por "+ time2.getGols()+ " a "+time1.getGols()+".");
		
		else
			System.out.println("Jogo terminou em empate.");
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		this.gols = gols;
	}
	
	
}
