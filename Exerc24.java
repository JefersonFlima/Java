package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc24 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite o salario do funcionario:");
		Float salario = sc.nextFloat(); 
		System.out.println("Digite o ganho em vendas:");
		Float valorVendas = sc.nextFloat(); 
		if (valorVendas <= 1500){
			   Float comissao = (float) (valorVendas * 0.03);
			   Float salarioFinal = salario + comissao;
			   System.out.println("o salario final do funcionario será de: " + salarioFinal + "R$");
		}else{
			   Float comissao = (float) ((valorVendas - 1500) * 0.05);
			   Float comissao1 = (float) (1500 * 0.03);
			   Float salarioFinal = salario + comissao + comissao1;
			   System.out.println("o salario final do funcionario será de: " + salarioFinal + "R$");
		}
		sc.close();
		}
}
