package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc12 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("digite a temperatura fahrenheit");
		double tempF = sc.nextFloat(); 
        double tempC = (tempF - 32) / 1.8;
        System.out.println("A Temperatura em Celsius será de: " + tempC + "º");
		sc.close();
	}	
}
