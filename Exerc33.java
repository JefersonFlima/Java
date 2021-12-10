package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc33 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int valorA = sc.nextInt(); 
		System.out.println("Digite um valor:");
		int valorB = sc.nextInt(); 
		if (valorA == valorB) {
			System.out.println("numeros iguais");
		} else {
		    if (valorA > valorB) {
		    	System.out.println("o primeiro valor é maior");
		    } else {
		    	System.out.println("o segundo valor é maior");
		    }
		}
		sc.close();
    }
}
