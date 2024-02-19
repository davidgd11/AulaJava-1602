package br.com.fiap;

import java.util.Scanner;

public class Exercicio1Scan {

	public static void main(String[] args) {
		
		float prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0;
		Scanner scan; //declarando um objeto 
		
		try {
			scan = new Scanner(System.in); //instanciando o objeto 
			System.out.println("Digite as notas das suas provas: ");
			
			prova1 = scan.nextFloat();
			prova2 = scan.nextFloat();
			prova3 = scan.nextFloat();
			prova4 = scan.nextFloat();
			
			System.out.println("Valor 1: " + prova1 + 
					"\nValor 2: " + prova2 + 
					"\nValor 3: " + prova3 +
					"\nValor 4: " + prova4);
			System.out.println("Média dos valores: " + ( (prova1 + prova2 + prova3 + prova4)/4) );
			
		} catch (Exception e) {
			System.out.println("Formato incorreto do número");
		}
		

	}

}
