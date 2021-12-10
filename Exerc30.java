package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc30 {
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
		    	System.out.println("a ordem crescente dos numeros é: " + valor3 + "," + valor2 + "," + valor1);
		    } else if (valor1 > valor2 && valor1 > valor3 && valor3 > valor2) {
		    	System.out.println("a ordem crescente dos numeros é: " + valor2 + "," + valor3 + "," + valor1);
		    } else if (valor2 > valor1 && valor2 > valor3 && valor1 > valor3) {
		    	System.out.println("a ordem crescente dos numeros é: " + valor3 + "," + valor1 + "," + valor2);
		    } else if (valor2 > valor1 && valor2 > valor3 && valor3 > valor1) {
		    	System.out.println("a ordem crescente dos numeros é: " + valor1 + "," + valor3 + "," + valor2);
		    } else if (valor3 > valor1 && valor3 > valor2 && valor1 > valor2) {
		    	System.out.println("a ordem crescente dos numeros é: " + valor2 + "," + valor1 + "," + valor3);
		    } else {
		    	System.out.println("a ordem crescente dos numeros é: " + valor1 + "," + valor2 + "," + valor3);
		    }
		} else {
			System.out.println("favor digitar numeros diferentes");
		}
		sc.close();
    }
}
