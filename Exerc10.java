package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc10 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite o pre�o de fabrica do carro");
		double precoFab = sc.nextFloat(); 
        double distribuidor = precoFab * 0.28;
        double impostos = precoFab * 0.45;
        double precoFinal = precoFab + impostos + distribuidor;
        System.out.println("o pre�o final do carro ser� de: " + precoFinal);
		sc.close();
	}	
}
