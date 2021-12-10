package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc16 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite a quantidade de maças compradas");
		double maca = sc.nextFloat(); 
        if (maca >= 12) {
            double custo = 1 * maca;
            System.out.println("voce comprou " + maca + " maças,custo final de: " + custo + "R$");
        } else {
        	double custo = 1.30 * maca;
        	System.out.println("voce comprou " + maca + " maças,custo final de: " + custo + "R$");
        }
		sc.close();
	}
}
