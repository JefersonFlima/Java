package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc15 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite um numero");
		double num = sc.nextFloat(); 
        if (num >= 0) {
        	System.out.println("este numero � positivo");
        } else {
        	System.out.println("este numero � negativo");
        }
		sc.close();
	}
}
