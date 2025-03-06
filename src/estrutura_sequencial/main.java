package estrutura_sequencial;

import java.util.Locale; /* Locale é usado para levar em cosideração as peculiaridades
das representações regionais do alfabeto,símbolos,números e datas. */

import java.util.Scanner; /* Scanner usado para ler entrada do teclado*/

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		/*Programa simples com objetivo de calcular área e o preço,
		 sobre as medidas de: largura e comprimento.*/
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", preco);
		
		sc.close();
	}

}
