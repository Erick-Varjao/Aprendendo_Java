package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*Faça um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
		calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo
		a fórmula: DIFERENCA = (A * B - C * D).*/
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int diferença = a * b - c * d;
		
		System.out.println("Diferença: " + diferença);
		
		sc.close();
	}

}
