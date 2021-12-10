package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc14 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite um numero");
		double num = sc.nextFloat(); 
        if (num >= 10) {
        	System.out.println("este numero é maior ou igual a 10");
        } else {
        	System.out.println("este numero é menor que 10");
        }
		sc.close();
	}	
}
