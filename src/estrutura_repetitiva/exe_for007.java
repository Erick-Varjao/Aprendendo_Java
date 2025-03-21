package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class exe_for007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na
		  tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois
		  o quadrado e o cubo do valor, conforme exemplo.*/
		
		System.out.println("Digite um número inteiro positivo: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		System.out.println("Obrigado por usar o programa!!");
		
		sc.close();
	}
}
