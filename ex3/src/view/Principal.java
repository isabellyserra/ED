package view;

import javax.swing.JOptionPane;
import controller.SomaController;

public class Principal {
	public static void main(String[] args) {
		SomaController sc = new SomaController();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero inteiro natural"));
		
		int saida = sc.somaSequencia(n);

		System.out.println("A soma dos n�meros de 0 a " + n + " � " + saida);	
	}

}
