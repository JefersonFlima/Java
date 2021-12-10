package exerciciosLivro2007;
import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String[]Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a base do triangulo");
		float base = sc.nextFloat();
		System.out.println("digite a altura do triangulo");
		float altura = sc.nextFloat();
		double res = altura*base/2;
		System.out.println("a area do triangulo é de: "+res+"cm²");
		sc.close();
	}
}
