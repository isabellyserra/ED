package view;
import javax.swing.JOptionPane;

import controller.PotenciaController;
public class Principal {
	public static void main(String[] args) {
		PotenciaController pc = new PotenciaController();
		
		String n = JOptionPane.showInputDialog("Insira um n�mero < = 12 para calcular seu fatorial");
		
		if(Integer.parseInt(n) > 12) {
			System.out.println("Insira um n�mero menor ou igual a 12");	
		} else {
			int potencia = pc.fatorial(Integer.parseInt(n));
			System.out.println("O fatorial de "+n+" � "+potencia);	
		}
	}
}
