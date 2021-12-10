package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc22 {
	public class Exerc21 {
		public static void main(String[]Args) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("Digite as horas trabalhadas no mês:");
			int horasTrabalhadas = sc.nextInt(); 
			System.out.println("Digite o salario por hora:");
			double salarioHora = sc.nextFloat(); 
			if (horasTrabalhadas <= 160) {
			    double salario = horasTrabalhadas * salarioHora;
			    System.out.println("o salario do funcionario é de: " + salario + "R$");
			} else {
			   double horasExtra = horasTrabalhadas - 160;
			   double  salarioExtra = (horasExtra * salarioHora) * 1.5;
			   double salario = salarioExtra + 160 * salarioHora;
			    System.out.println("o salario do funcionario é de: " + salario + "R$");
			}
			sc.close();
		}
	}
}
