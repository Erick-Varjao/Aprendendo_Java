package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exe_for004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão 
		  do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem 
		  "divisao impossivel"*/
		
		int num, pares;
		System.out.println("Digite a quantidade de números que será feito o teste: ");
		num = sc.nextInt();
		
		double num1, num2, divi;
		
		for(int i = 0; i < num; i++) {
			System.out.println("Digite o primeiro valor: ");
			num1 = sc.nextDouble();
			System.out.println("Digite o segundo valor: ");
			num2 = sc.nextDouble();
			if(num2 == 0) {
				System.out.println("Divisão Impossível!!");
			}
			else {
				divi = num1 / num2;
				System.out.printf("Resultado do 1° número dividido pelo 2º número: %.1f%n", divi);
			}
		}
		System.out.println("Obrigado por usar o programa!");
		sc.close();
	}
}
