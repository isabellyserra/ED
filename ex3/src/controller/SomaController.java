package controller;

public class SomaController {
	public SomaController() {
		super();
	}
	
	public int somaSequencia(int n) {
		// Condição de parada - verifica se o número a ser somado é menor que zero, se for, retorna 0
		if (n < 0) {
			// retorna 0, pois não faz a soma
			return 0;
		} else {
			// retorna o número recebido mais o seu próximo (n-1)
			return n + somaSequencia(n -1);
		}
	}

}
