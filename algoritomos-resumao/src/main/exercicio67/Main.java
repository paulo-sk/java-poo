package main.exercicio67;

public class Main {

	public static void main(String[] args) {
		//criar um retangulo com 60 "colunas" e 10 "linhas"
		posiciona(10,10);
		
	}
	
	public static void posiciona(int coluna, int linha) {
	
		
		for(int i = 1; i <= linha; i++) {
			
			for(int k = 1; k <= coluna; k++) {
				
				if(i == 1 || i == linha) {
					System.out.print(" + "); //coloquei espaco do lado e do outro para ficar simetrico. (nos 3 print)
				}
				
				else if(k == 1 || k == coluna) {
					System.out.print(" + "); 
				}
				
				else
					System.out.print("   ");
					
			}
			System.out.println();
		}
	}

}
