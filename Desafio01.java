package AvaliaçãoLPA;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double a,b,soma,sub,mult,div;
		
		System.out.println("Informe o primeiro valor:  ");
		a=ler.nextDouble();
		
		System.out.println("Informe o segundo valor:  ");
		b=ler.nextDouble();
		
		soma=a+b;
		sub=a-b;
		mult=a*b;
		div=a/b;
		
		System.out.println ("O resultad da soma é: " + soma);
        System.out.println("O resultado da subtração é: "+ sub);
        System.out.println("O resultado da multiplicação é: "+mult);
        System.out.println("O resultado da divisão é:  " +div);
        
        ler.close();
	}

}
