package br.com.fiap;

import java.util.Scanner;

public class Exercicio3Scan {
	
	public static void main(String[] args) {
		
		float pi = 3.14f, raio = 0;
		Scanner scan;
		
		try {
			
			scan = new Scanner(System.in);
			System.out.println("Digite o valor do raio do círculo: ");
			raio = scan.nextFloat();
			
			System.out.println("A área do círculo é: " + (pi * (raio * raio)));
			
		} catch (Exception e) {
			
		}
		
	}
}
