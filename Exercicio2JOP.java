package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio2JOP {
	
	public static void main(String[] args) {
		
		int ano = 0, nasc = 0;
		String aux;
		try {
			
			aux = JOptionPane.showInputDialog("Digite o ano em que estamos: ");
			ano = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog("Digite o ano em que você nasceu: ");
			nasc = Integer.parseInt(aux);
			
			
			
			JOptionPane.showMessageDialog(null, "A sua idade é: " + (ano - nasc));

			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto!");
		}

	}


}
