package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exe_for006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Ler um número inteiro N e calcular todos os seus divisores*/
		
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt(); 
		
		for(int i = 1; i < num; i++)
			if (num % i == 0) {
				System.out.println("Divisores: " + i);
			}
		System.out.println("Obrigado por usar o programa!!");
		sc.close();
	}
}
