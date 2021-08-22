package view;

import javax.swing.JOptionPane;
import controller.EncontraController;

public class Principal {
	public static void main(String[] args) {
		EncontraController ec = new EncontraController();
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro de 10 a 999999"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro de 0 a 9"));
		
		if(n1 > 999999 || n1 < 10) {
			System.err.println("o primerio número deve estar entre 10 e 999999");
		} else if (n2 < 0 || n2 > 9) {
			System.err.println("o segundo número deve estar entre 0 e 9");
		}else {
			int saida = ec.encontraVezes(n1, n2);

			System.out.println("O número " + n2 + " aparece no número " + n1 + " " + saida + "x");		
		}
	}

}
