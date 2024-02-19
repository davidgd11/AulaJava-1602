package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio3JOP {

	public static void main(String[] args) {
		
		float pi = 3.14f, raio = 0;
		String aux;
		
		try {
			
			aux = JOptionPane.showInputDialog("Digite o raio do círculo: ");
			raio = Float.parseFloat(aux); 
			
			JOptionPane.showMessageDialog(null, "A área do círculo é: " + (pi*(raio * raio)));
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato incorreto!");
		}

	}

}
