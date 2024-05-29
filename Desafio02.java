package AvaliaçãoLPA;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		
		double b,h,a;
		
		System.out.println ("Informe a medida da base do triângulo: ");
        b= ler.nextDouble();
        
        System.out.println ("Informe a altura do triângulo: ");
        h=ler.nextDouble();
        
        a=b*h/2;
        		
        System.out.println ("A área desse triângulo é: " +a);
        
        ler.close();
	}

}
