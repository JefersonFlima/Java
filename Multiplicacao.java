package exerciciosLivro2007;

import java.util.Scanner;

public class Multiplicacao {
	public static void main(String[]args) { 
		Scanner sc = new Scanner(System.in);

		System.out.println("digite um valor");
		int v1 = sc.nextInt();
		System.out.println("digite o multiplicador");
		int v2 = sc.nextInt();
		int res = v1*v2;
		System.out.println("a multiplicação de " +v1+ " x " +v2 + " é igual: " + res);	
		sc.close();
	}
}
