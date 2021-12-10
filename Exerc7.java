package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc7 {
	public static void main(String[]Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite quantos anos voce tem");
		int anos = sc.nextInt();
		System.out.println("digite quantos meses voce tem");
		int meses = sc.nextInt();
		System.out.println("digite quantos dias voce do mes voce tem");
		int dias = sc.nextInt();
		int total  = anos * 365 + meses * 30 + dias;
		System.out.println("voce possui: "+total+" dias de vida");
		sc.close();
	}
}
