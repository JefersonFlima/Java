package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc32 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite o nome do time A:");
		String timeA = sc.next(); 
		System.out.println("Digite o nome do time B:");
		String timeB = sc.next(); 
		System.out.println("Digite o numero de gols do time A:");
		int golsA = sc.nextInt(); 
		System.out.println("Digite o numero de gols do time B:");
		int golsB = sc.nextInt(); 
		if (golsA > golsB) {
			System.out.println("o vencedor é o time: " + timeA +" por " + golsA + " a " + golsB);
		} else {
		    if (golsB > golsA) {
		    	System.out.println("o vencedor é o time: " + timeB + " por " + golsB + " a " + golsA);
		    } else {
		    	System.out.println("empate");
		    }
		}
		sc.close();
    }
}
