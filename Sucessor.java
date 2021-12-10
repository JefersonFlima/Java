package exerciciosLivro2007;

import java.util.Scanner;

public class Sucessor {
	public static void main(String[]Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um numero");
		int num = sc.nextInt();
		int sucessor = num +1;
		System.out.println("o sucessor de "+num+" é "+sucessor);
	sc.close();	
	}
	
}
