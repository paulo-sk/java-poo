package lista4_3.exercicio4.models;

public class Horario {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Horario() {
		
	}
	public Horario(int h) {
		this.hora = h;
	}
	
	public Horario(int h, int m) {
		this(h);
		this.minuto = m;
	}
	
	public Horario(int h, int m, int s) {
		this(h, m);
		this.segundo = s;
	}
	
	public Horario(Horario h) {
		this.hora = h.hora;
		this.minuto = h.minuto;
		this.segundo = h.segundo;
	}
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void setHorario(int h, int m, int s) {
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}
	
	
	public void somarHoras() {
		
	}
	
	public void subtrairHoras() {
			
		}
	
	public int numSegundos() {
		return 2;
	}
	
	public void mostrarAMPM() {
		
	} 
	
}
