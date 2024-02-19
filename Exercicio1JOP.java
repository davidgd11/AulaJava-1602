package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio1JOP {

	public static void main(String[] args) {
		
		float prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0;
		String aux;
		try {
			
			aux = JOptionPane.showInputDialog("Digite a nota da sua prova: ");
			prova1 = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Digite a nota da sua prova: ");
			prova2 = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Digite a nota da sua prova: ");
			prova3 = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Digite a nota da sua prova: ");
			prova4 = Float.parseFloat(aux);
			
			
			JOptionPane.showMessageDialog(null, "Média das provas: " + ((prova1 + prova2 + prova3 + prova4) /4));

			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto!");
		}

	}

}
