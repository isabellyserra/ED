package controller;

public class InversaoController {
	String saida = "";
	public String inverter(String word, int position) {
		// Condição de parada - verifica se a posição a ser invertida menor que zero (primeira posição do vetor de letras))
		if (position < 0) {
			// retorna a string gerada
			return saida;
		} else {
			// armazena o valor obtido da posição atual
			saida = saida + word.charAt(position);
			// retorna a palara recebida e a posição menos um valor, para pegar uma posição a atrás, ou seja, a próxima letra.
			return inverter(word, position - 1);
		}
	}

}
