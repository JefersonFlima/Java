package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc26 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite o estoque atual:");
		int EstoqueAtual = sc.nextInt(); 
		System.out.println("Digite o estoque maximo:");
		int EstoqueMaximo = sc.nextInt(); 
		System.out.println("Digite o estoque minimo:");
		int EstoqueMin = sc.nextInt(); 
		Float QuantMedia = (float) (EstoqueMaximo + EstoqueMin) / 2;
				if (EstoqueAtual >= QuantMedia) {
					System.out.println("não é necessario comprar estoque");
				} else {
					System.out.println("é necessario comprar estoque");
				}
		sc.close();
		}
}
