package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Faça um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
		Em seguida, calcule e mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B.*/
		
		double value1, value2, value3, triangulo, circulo, trapezio, quadrado, retangulo;
		
		value1 = sc.nextDouble();
		value2 = sc.nextDouble();
		value3 = sc.nextDouble();
		
		triangulo = value1 * value3 / 2.0;
		circulo = 3.14159 * value3 * value3;
		trapezio = (value1 + value2) / 2.0 * value3;
		quadrado = value2 * value2;
		retangulo = value1 * value2;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();
	}

}
