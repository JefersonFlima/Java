package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc20 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite um numero");
		int num1 = sc.nextInt(); 
		System.out.println("digite outro numero");
		int num2 = sc.nextInt(); 
        if (num1 != num2) {
            if (num1 > num2) {
            	System.out.println("o primeiro numero é maior " + num2 + ">" + num1);
            } else {
            	System.out.println("o segundo numero é maior " + num1 + ">" + num2);
            }
        } else {
        	System.out.println("favo digitar numeros diferente!!!");
        }
		sc.close();
	}
}
