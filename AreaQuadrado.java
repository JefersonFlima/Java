package exerciciosLivro2007;

import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[]Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o valor do lado do quadrado");
		int lado = sc.nextInt();
		int res = lado*lado;
		System.out.println("a area do quadrado é = "+res+"cm²");
		sc.close();
	}
}
