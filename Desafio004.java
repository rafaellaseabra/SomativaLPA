package AvaliaçãoLPA;

import java.util.Scanner;

public class Desafio004 {

	public static void main(String[] args) {
		int soma = 0 ;
		int valor[] = new int [15];
		Scanner ler = new Scanner(System.in);

		for(int i=0; i<15; i++) {
			System.out.println("Escreva seu valor: " +i  );
			valor[i] = ler.nextInt();
			
			soma = soma + valor[i];
		}
			System.out.println("A soma dos valores apresentados são: " + soma );
			
			ler.close();
		}
		 
		
	}
		
			
		

	


