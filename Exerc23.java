package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc23 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("escreva seu nome");
		String nome = sc.next(); 
		System.out.println("escreva seu sexo");
		String sexo = sc.next(); 
		System.out.println("escreva sua altura");
		Float altura = sc.nextFloat(); 
		if (sexo.equals("m")){
			   Float pesoIdeal = (float) (72.7 * altura - 58);
			   System.out.println("a pessoa de nome " + nome + " de sexo Masculino tem o peso ideal de " + pesoIdeal);

			}else if(sexo.equals("f")){
			   Float pesoIdeal = (float) (62.1 * altura - 44.7);
			   System.out.println("a pessoa de nome " + nome + " de sexo Feminino tem o peso ideal de " + pesoIdeal);
		}else{
		System.out.print("sexo indefinido");
		}
		sc.close();
		}
	}

