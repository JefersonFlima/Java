package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc17 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite a nota da prova 1");
		int N1 = sc.nextInt(); 
		System.out.println("digite a nota da prova 2");
		int N2 = sc.nextInt(); 
		double nota = (N1 + N2) / 2;
        if (nota >= 6) {
        	System.out.println("aluno aprovado,nota final de:" + nota);
        } else {
        	System.out.println("aluno reprovado,nota final de:" + nota);
        }
		sc.close();
	}	
}
