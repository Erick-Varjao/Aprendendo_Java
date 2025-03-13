package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exe_for003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
		 Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
		 Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
		 sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.*/
		
		int num;
		System.out.println("Digite a quantidade de testes que será feito: ");
		num = sc.nextInt();
		
		double valor1, valor2, valor3,media;
		for (int i = 0; i < num; i++) {
			System.out.println("Digite o primeiro valor: (com casa decimal)");
			valor1 = sc.nextDouble();
			System.out.println("Digite o segundo valor: (com casa decimal)");
			valor2 = sc.nextDouble();
			System.out.println("Digite o terceiro valor: (com casa decimal)");
			valor3 = sc.nextDouble();

			valor1 = valor1 * 2.0;
			valor2 = valor2 * 3.0;
			valor3 = valor3 * 5.0;
			media = (valor1 + valor2 + valor3) / 10;

			System.out.printf("Média empoderada: %.1f%n", media);
		}
		sc.close();
	}
}
