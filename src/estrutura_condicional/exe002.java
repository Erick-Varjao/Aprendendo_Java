package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exe002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/
		
		int num;
		System.out.println("\nDigite um número inteiro: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}
		
		sc.close();
	}

}
