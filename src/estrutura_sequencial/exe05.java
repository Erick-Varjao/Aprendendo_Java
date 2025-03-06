package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Faça um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1
		,o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
		Calcule e mostre o valor a ser pago.*/
		
		int cod_peca1 = sc.nextInt();
		int num_peca1 = sc.nextInt();
		double valor_peca1 = sc.nextDouble();
		
		int cod_peca2 = sc.nextInt();
		int num_peca2 = sc.nextInt();
		double valor_peca2 = sc.nextDouble();
		
		double total_peca1 = num_peca1 * valor_peca1;
		double total_peca2 = num_peca2 * valor_peca2;
		
		double total = total_peca1 + total_peca2;
		
		System.out.printf("Valor total a pagar: %.2f%n", total);
		
		sc.close();
	}

}
