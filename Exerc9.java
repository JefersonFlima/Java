package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc9 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite o salario atual");
		double salarioAtual = sc.nextFloat(); 
		System.out.println("digite a % de reajuste");
		double Reajuste = sc.nextFloat(); 
        double salarioFinal = salarioAtual * Reajuste / 100 + salarioAtual;
        System.out.println("o salario após o reajuste será de: " + salarioFinal);
		sc.close();
	}	
}
