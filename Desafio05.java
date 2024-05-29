package AvaliaçãoLPA;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		String Nome [] = new String [6];
		
		for (int i=0; i<6; i++) {
			System.out.print("Informe o nome do carro: " );
			Nome [i] = ler.next();
		}
			
			
		
		for (int i=0; i<6; i++) {
			

				System.out.print ("| " + Nome[i] + "| " + "|*");

			}
			System.out.println();
	}
	

	}
