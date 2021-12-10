package exerciciosLivro2007;

import java.util.Scanner;

public class Soma {
	public static void main(String[]Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um valor");	
		int v1 = sc.nextInt();
		System.out.println("digite outro valor");
		int v2 = sc.nextInt();
		int res = v1+v2;
		System.out.println("a soma de "+v1+" + "+v2+" é igual a :"+ res);
		sc.close();
	}	
}
