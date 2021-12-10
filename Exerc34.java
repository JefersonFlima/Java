package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc34 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int X = sc.nextInt(); 
		System.out.println("Digite um valor:");
		int Y = sc.nextInt(); 
		int Z = (X * Y) + 5;
		if (Z <= 0) {
			System.out.println("A");
		} else {
		    if (Z <= 100) {
		    	System.out.println("B");
		    } else {
		    	System.out.println("C");
		    }
		}
		sc.close();
    }
}
