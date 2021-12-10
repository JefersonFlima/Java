package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc28 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int valor1 = sc.nextInt(); 
		System.out.println("Digite um numero:");
		int valor2 = sc.nextInt(); 
		System.out.println("Digite um numero:");
		int valor3 = sc.nextInt(); 
		if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
		    if (valor1 > valor2 && valor1 > valor3) {
		    	System.out.println("o maior valor é o primeiro ," + valor1);
		    }
		    else if (valor2 > valor1 && valor2 > valor3) {
		    	System.out.println("o maior valor é o segundo ," + valor2);
		    } else {
		    	System.out.println("o maior valor é o terceiro ," + valor3);
		    }
		} else {
			System.out.println("favor digitar numeros diferentes");
		}
		sc.close();
    }	
}
