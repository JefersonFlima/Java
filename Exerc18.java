package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc18 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite seu ano de nascimento");
		int nascimento = sc.nextInt(); 
		System.out.println("digite o ano atual");
		int anoAtual = sc.nextInt(); 
		int idade = anoAtual - nascimento;
        if (idade >= 18) {
        	System.out.println("pode votar");
        } else {
        	System.out.println("nao pode votar");
        }
		sc.close();
	}	
}
