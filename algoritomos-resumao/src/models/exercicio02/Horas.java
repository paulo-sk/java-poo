package models.exercicio02;

public class Horas {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Horas(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public int calcularTotalDeSegundos() {
		return (this.hora*60*60) + (this.minuto * 60) + (this.segundo);
	}
}
