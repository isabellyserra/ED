package controller;

public class SomaController {
	public SomaController() {
		super();
	}
	
	public int somaSequencia(int n) {
		// Condi��o de parada - verifica se o n�mero a ser somado � menor que zero, se for, retorna 0
		if (n < 0) {
			// retorna 0, pois n�o faz a soma
			return 0;
		} else {
			// retorna o n�mero recebido mais o seu pr�ximo (n-1)
			return n + somaSequencia(n -1);
		}
	}

}
