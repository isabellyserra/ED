package view;

import javax.swing.JOptionPane;
import controller.InversaoController;

public class Principal {
	public static void main(String[] args) {
		InversaoController ic = new InversaoController();
		
		String word = JOptionPane.showInputDialog("Insira uma palavra para ver seu inverso");
		
		String saida = ic.inverter(word, word.length() - 1);

		System.out.println("O inverso de " + word + " é " + saida);	
	}

}
