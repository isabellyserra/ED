package controller;

public class InversaoController {
	String saida = "";
	public String inverter(String word, int position) {
		// Condi��o de parada - verifica se a posi��o a ser invertida menor que zero (primeira posi��o do vetor de letras))
		if (position < 0) {
			// retorna a string gerada
			return saida;
		} else {
			// armazena o valor obtido da posi��o atual
			saida = saida + word.charAt(position);
			// retorna a palara recebida e a posi��o menos um valor, para pegar uma posi��o a atr�s, ou seja, a pr�xima letra.
			return inverter(word, position - 1);
		}
	}

}
