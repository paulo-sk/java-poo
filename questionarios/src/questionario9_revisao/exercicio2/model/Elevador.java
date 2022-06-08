package questionario9_revisao.exercicio2.model;

public class Elevador {

	private int andarAtual = 0;

	private int totalAndares;

	private int qtdePresentes;

	private int capacidadeElevador;

	
	
	public Elevador(int totalAndares, int capacidadeElevador) {
		this.totalAndares = totalAndares;
		this.capacidadeElevador = capacidadeElevador;
	}

	public void entrar(int quantidade) {

		if ((this.capacidadeElevador - this.qtdePresentes) >= quantidade) {

			this.qtdePresentes += quantidade;

		}

		else  {
			int vagas = (this.capacidadeElevador - this.qtdePresentes);
			System.out.println("Nao cabe " + quantidade + " pessoas pois tem " + vagas + " vagas no momento.\n");
		}

	}

	public void sair(int quantidade) {

		if ((this.qtdePresentes - quantidade) >= 0) {
			this.qtdePresentes -= quantidade;

		}
		else
			System.out.println("Quantidade de saida deve ser menor ou igual ao numero de pessoas presentes, atualmente: "+ this.qtdePresentes + " pessoas presentes.");

	}

	public void subir(int n) {

		if((this.totalAndares - this.andarAtual) >= n) {
			this.andarAtual += n;
			return;

		}

		int podeSubir = (this.totalAndares - this.andarAtual);

		System.out.println("Nao foi possivel, só pode subir + " + podeSubir + " andar(es).");

	}

	public void descer(int n) {

		if ((this.andarAtual - n) >= 0) {

			this.andarAtual -= n;

			return;

		}

		System.out.println("Nao foi possivel, só pode descer + " + this.andarAtual + " andar(es).");

	}
	
	//vou usar o toString como um "relatorio" para imprimir a situacao total do elevadaor.

	@Override
	public String toString() {
		return "Elevador [andarAtual=" + andarAtual + ", totalAndares=" + totalAndares + ", qtdePresentes="
				+ qtdePresentes + ", capacidadeElevador=" + capacidadeElevador + "]";
	}
	
	
	//getters and setters 
	
	public int getAndarAtual() {
		return andarAtual;
	}


	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getQtdePresentes() {
		return qtdePresentes;
	}

	public void setQtdePresentes(int qtdePresentes) {
		this.qtdePresentes = qtdePresentes;
	}

	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}
	
	

}