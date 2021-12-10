package exerciciosLivro2007;
import java.util.Scanner;
public class AreaRetangulo {
	public static void main(String[]Args){
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o lado do retangulo");
		int lado = sc.nextInt();
		System.out.println("digite a altura do retangulo");
		int altura = sc.nextInt();
		int res = altura*lado;
		System.out.println("a area do retangulo é: "+res+"cm²");
	sc.close();	
	}
}
