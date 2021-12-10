package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc29 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int valor1 = sc.nextInt(); 
		System.out.println("Digite um numero:");
		int valor2 = sc.nextInt(); 
		System.out.println("Digite um numero:");
		int valor3 = sc.nextInt(); 
		if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
		    if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
		        int soma = valor1 + valor2;
		        System.out.println("a soma de " + valor1 + " + " + valor2 + " é igual a " + soma);
		    } else if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2) {
		        int soma = valor1 + valor3;
		        System.out.println("a soma de " + valor1 + " + " + valor3 + " é igual a " + soma);
		    } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
		        int soma = valor2 + valor1;
		        System.out.println("a soma de " + valor2 + " + " + valor1 + " é igual a " + soma);
		    } else if (valor2 > valor1 && valor2 > valor3 && valor3 > valor1) {
		        int soma = valor2 + valor3;
		        System.out.println("a soma de " + valor2 + " + " + valor3 + " é igual a " + soma);
		    } else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2) {
		        int soma = valor3 + valor1;
		        System.out.println("a soma de " + valor3 + " + " + valor1 + " é igual a " + soma);
		    } else {
		        int soma = valor3 + valor2;
		        System.out.println("a soma de " + valor3 + " + " + valor2 + " é igual a " + soma);
		    }
		} else {
			System.out.println("favor digitar numeros diferentes");
		}
		sc.close();
    }
}
