package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc8 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite o numero de eleitores");
		int eleitores = sc.nextInt();
		System.out.println("digite o numero de votos brancos");
		int branco = sc.nextInt();
		System.out.println("digite o numero de votos validos");
		int validos = sc.nextInt();
		int nulos  = eleitores - branco - validos;
        double PorcB = branco * 100 / eleitores;
        double PorcV = validos * 100 / eleitores;
        double PorcN = nulos * 100 / eleitores;
        System.out.println("a porcentagem de votos branco é de: " + PorcB + "% com total de votos de: " + branco);
        System.out.println("a porcentagem de votos validos é de: " + PorcV + "% com total de votos de: " + validos);
        System.out.println("a porcentagem de votos nulos é de: " + PorcN + "% com total de votos de: " + nulos);
		sc.close();
	}	
}
