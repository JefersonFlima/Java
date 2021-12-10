package exerciciosLivro2007;

import java.util.Scanner;

public class Antecessor {
	public static void main(String[]Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um numero");
		int num = sc.nextInt();
		int antecessor = num -1;
		System.out.println("o antecessor de "+num+" é "+antecessor);
	sc.close();	
	}
}
