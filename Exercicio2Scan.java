package br.com.fiap;

import java.util.Scanner;

public class Exercicio2Scan {

	public static void main(String[] args) {
		 
		int ano = 0, nasc = 0;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite o ano em que nós estamos: ");
			ano = scan.nextInt();
			
			System.out.println("Digite a data de seu nascimento: ");
			nasc = scan.nextInt();
			
			System.out.println("Ano atual: " + ano + 
					"\nAno de seu nascimento: " + nasc +
					"\nSua idade: " + (ano - nasc));
			
			
		} catch (Exception e) {
			System.out.println("Errado!");
		}

	}

}
