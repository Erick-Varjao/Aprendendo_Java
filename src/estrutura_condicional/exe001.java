package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exe001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/
		
		int num;
		System.out.println("\nDigite um número inteiro: ");
		num = sc.nextInt();
		
		if(num >= 0) {
			System.out.println("Número não negativo!");
		}
		else{
			System.out.println("Número negativo!");
		}
		
		sc.close();
	}
}
