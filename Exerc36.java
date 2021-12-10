package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc36 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite a idade do primeiro homem");
		int homemA = sc.nextInt(); 
		System.out.println("digite a idade do segundo homem");
		int homemB = sc.nextInt(); 
		System.out.println("digite a idade da primeira mulher");
		int mulherA = sc.nextInt(); 
		System.out.println("digite a idade da segunda mulher");
		int mulherB = sc.nextInt(); 
		if (homemA != homemB && mulherA != mulherB) {
		    if (homemA > homemB && mulherA > mulherB) {
		        int somaA = homemA + mulherB;
		        int somaB = homemB + mulherA;
		        System.out.println("a soma do homem mais velho e mulher mais nova é: " + somaA);
		        System.out.println("a soma do homem mais novo e mulher mais velha é: " + somaB);
		    } else if (homemB > homemA && mulherB > mulherA) {
		        int somaA = homemB + mulherA;
		        int somaB = homemA + mulherB;
		        System.out.println("a soma do homem mais velho e mulher mais nova é: " + somaA);
		        System.out.println("a soma do homem mais novo e mulher mais velha é: " + somaB);
		    } else if (homemA > homemB && mulherB > mulherA) {
		        int somaA = homemA + mulherA;
		        int somaB = homemB + mulherB;
		        System.out.println("a soma do homem mais velho e mulher mais nova é: " + somaA);
		        System.out.println("a soma do homem mais novo e mulher mais velha é: " + somaB);
		    } else {
		        int somaA = homemB + mulherB;
		        int somaB = homemA + mulherA;
		        System.out.println("a soma do homem mais velho e mulher mais nova é: " + somaA);
		        System.out.println("a soma do homem mais novo e mulher mais velha é: " + somaB);
		    }
		} else {
			System.out.println("favor digitar idades diferetes para pessoas de mesmo sexo");
		}
		sc.close();
    }
}
