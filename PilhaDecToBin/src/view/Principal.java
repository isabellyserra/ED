package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController controller = new ConverteController();
		
		int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor"));
		String convertido = controller.decToBin(decimal);
		System.out.println(convertido);
	}

}
