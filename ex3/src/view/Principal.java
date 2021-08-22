package view;

import javax.swing.JOptionPane;
import controller.SomaController;

public class Principal {
	public static void main(String[] args) {
		SomaController sc = new SomaController();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro natural"));
		
		int saida = sc.somaSequencia(n);

		System.out.println("A soma dos números de 0 a " + n + " é " + saida);	
	}

}
