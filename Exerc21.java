package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc21 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite a hora de inicio do jogo");
		int horaI = sc.nextInt(); 
		System.out.println("digite a hora de fim do jogo");
		int horaF = sc.nextInt(); 
		int duracao = horaF - horaI;
		if (duracao > 0) {
			System.out.println("a duração do jogo foi de:" + duracao + "hrs");
		} else {
		    duracao = duracao + 24;
		    System.out.println("a duração do jogo foi de:" + duracao + "hrs");
		}
		sc.close();
	}
}

