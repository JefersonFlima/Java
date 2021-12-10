package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc11 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite o salario do funcionario");
		double salarioFixo = sc.nextFloat(); 
		System.out.println("digite a quantidade de carros vendidas");
		double carrosVendidos = sc.nextFloat(); 
		System.out.println("digite o ganho com a venda de cada carro");
		double ValorPCarro = sc.nextFloat(); 
		System.out.println("digite o ganho total com a venda dos carros");
		double ganhoTotal = sc.nextFloat(); 
		double salarioFinal = salarioFixo + ValorPCarro * carrosVendidos + 5 * ganhoTotal / 100;
        System.out.println("O salário final do vendedor equivale a: " + salarioFinal + "R$");
		sc.close();
	}	
}
