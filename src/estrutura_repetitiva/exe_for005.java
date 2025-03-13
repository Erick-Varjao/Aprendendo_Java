package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exe_for005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de 
		  N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1*/
		
		System.out.print("Digite um número inteiro não negativo: ");
		int num = sc.nextInt();
		int fat = 1;

		for (int i = 1; i <= num; i++) {
			fat = fat * i;
		}

		System.out.println(fat);
		System.out.println("Obrigado por usar o programa!!");
		sc.close();
	}
}
