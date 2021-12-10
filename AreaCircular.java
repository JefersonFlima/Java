package exerciciosLivro2007;

import java.util.Scanner;

public class AreaCircular {
	public static void main(String[]Args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("digite a area do circulo");
		float area = sc.nextFloat();
		double res = pi*(area*area);
		System.out.println("a area do circulo é = "+res);
		sc.close();
	}
}
