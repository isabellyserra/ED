package controller;

public class EncontraController {
	public EncontraController() {
		super();
	}

	public int encontraVezes(int n1, int n2) {
		// Condi��o de parada - verifica se o n�mero a ser dividido � menor ou igual a zero, se for, retorna 0 para a soma
		if (n1 <= 0) {
			// retorna 0, pois n�o faz mais a divis�o
			return 0;
		} else {
			int divResult = n1 / 10;
			int resto = n1 % 10;
			int cont = resto == n2 ? 1 : 0;
			// retorna resultado de n1/10 e n2 para dividir novamente
			// sempre acumulando 1 se o resto da divis�o de n1 por 10 for igual a n2
			return  cont + encontraVezes(divResult, n2);
		}
	}

}
