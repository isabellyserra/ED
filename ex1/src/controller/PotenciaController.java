package controller;

public class PotenciaController {
	public PotenciaController() {
		super();
	}
	
	public int fatorial(int n) {
		// Condi��o de parada - verifica se o fatorial a ser calculado � zero
		if (n == 0) {
			// retorna 1, pois o fatorial de 0 � sempre 1, quebrando assim o loop
			return 1;
		} else {
			// retorna o fatorial recebido multiplicado pelo fatorial -1
			return n * fatorial(n -1);
		}
	}

}
