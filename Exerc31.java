package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc31 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite uma medida:");
		int A = sc.nextInt(); 
		System.out.println("Digite uma medida:");
		int B = sc.nextInt(); 
		System.out.println("Digite uma medida:");
		int C = sc.nextInt(); 
		if (A < B + C && B < A + C && C < A + B) {
			System.out.println("é um triangulo");
		} else {
			System.out.println("nao é um triangulo");
		}
		sc.close();
    }
}
