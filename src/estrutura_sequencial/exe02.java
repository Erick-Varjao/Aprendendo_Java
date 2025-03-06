package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Faça um programa para ler o valor do raio de um círculo, e depois 
		mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.*/
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double elevado = Math.pow(raio, 2);
		
		double result = elevado * pi;
		
		System.out.printf("Área: %.4f%n", result);
		
		sc.close();
	}

}
