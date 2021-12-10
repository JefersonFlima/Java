package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc27 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int valor = sc.nextInt(); 
		if (valor > 0) {
			System.out.println("numero positivo");
		} else {
		    if (valor < 0) {
		    	System.out.println("numero negativo");
		    }else{
		    System.out.println("numero igual a 0");
		    }
		}
		sc.close();
    }	
}
