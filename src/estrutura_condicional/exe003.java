package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exe003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
		 Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.*/
		
		int numA, numB;
		System.out.println("Digite o 1º número: ");
		numA = sc.nextInt();
		System.out.println("Digite o 2º número: ");
		numB = sc.nextInt();
		
		if(numA % numB == 0 || numB % numA == 0) {
			System.out.println("São multiplos!");
		}
		else {
			System.out.println("Não são multiplos!");
		}
		
		sc.close();
	}

}
