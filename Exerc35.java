package exerciciosLivro2007;

import java.util.Scanner;

public class Exerc35 {
	public static void main(String[]Args) {
		Scanner sc  = new Scanner(System.in);
		float Gasolina = (float)3.30;
		float Alcool = (float) 2.90;
		System.out.println("Digite a quantia de litros vendida:");
		float LitrosVend = sc.nextFloat(); 
		System.out.println("Digite o tipo de combustivel:");
		String combustivel = sc.next(); 
		if (combustivel.equals("A") ||combustivel.equals("a")|| combustivel.equals ("G")|| combustivel.equals ("g")){
			if (combustivel.equals("A") || combustivel.equals ("a")){
				if (LitrosVend <= 20){
					float TotalPagar = (float) (Alcool * 0.97 * LitrosVend);
					System.out.println("total a pagar de : " + TotalPagar);
				}else {
					LitrosVend = LitrosVend - 20;
					float TotalPagar =  (float) (Alcool * 0.97 * 20 + Alcool * 0.95 * LitrosVend);
					System.out.println("total a pagar de : " + TotalPagar);
				}		
			}if(combustivel.equals("G") || combustivel.equals("g")){
					if (LitrosVend <= 20){
						float TotalPagar = (float) (Gasolina * 0.96 * LitrosVend);
						System.out.println("total a pagar de : " + TotalPagar);
					}else { 
						LitrosVend = LitrosVend - 20;
						float TotalPagar = (float) (Gasolina * 0.96 * 20 + Gasolina * 0.94 * LitrosVend);
						System.out.print("total a pagar de : " + TotalPagar);
					}
			}		

		}else{ 
			System.out.println("tipo invalido");
		}
		sc.close();
	}    
}
