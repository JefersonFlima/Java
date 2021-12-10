package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc25 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite o numero do cliente:");
		int NumCliente = sc.nextInt(); 
		System.out.println("Digite o saldo do cliente:");
		Float saldo = sc.nextFloat(); 
		System.out.println("Digite o debito do cliente:");
		Float debito = sc.nextFloat(); 
		System.out.println("Digite o credito do cliente:");
		Float credito = sc.nextFloat(); 
		int saldoAtual = (int) (saldo - debito + credito);
		if (saldoAtual <= 0) {
			System.out.println("numero cod é: "+ NumCliente +"seu saldo  é de " + saldoAtual + ", saldo atual positivo");
		} else {
			System.out.println("numero cod é: "+ NumCliente + "seu saldo  é de " + saldoAtual + ", saldo atual negativo");
		}
		sc.close();
		}
}
