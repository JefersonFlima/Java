package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc13 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double N1 = sc.nextFloat(); 
		System.out.println("Digite a primeira nota: ");
		double N2 = sc.nextFloat(); 
		System.out.println("Digite a primeira nota: ");
		double N3 = sc.nextFloat(); 
		double NotaFinal = (N1 * 2 + N2 * 3 + N3 * 5) / 10;
        System.out.println("a média ponderada do aluno é: " + NotaFinal);
		sc.close();
	}	
}
