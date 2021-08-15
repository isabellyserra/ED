package controller;

public class PotenciaController {
	public PotenciaController() {
		super();
	}
	
	public int fatorial(int n) {
		// Condição de parada
		if (n == 0) {
			return 1;
		} else {
			return n * fatorial(n -1);
		}
	}

}
