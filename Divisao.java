package exerciciosLivro2007;

import java.util.Scanner;

public class Divisao {
	public static void main(String[]Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um valor");
		float v1 = sc.nextFloat();
		System.out.println("digite o divisor");
		float v2 = sc.nextFloat(); 
		float res = v1/v2;
		System.out.println("a divisão de "+v1+" por "+v2+" é igual a: "+res);
		sc.close();
	}	
}
