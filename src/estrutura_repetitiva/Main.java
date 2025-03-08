package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		int soma = 0;
		
		while (x != 0) {
			soma = soma + x;
			System.out.println("Digite novamente");
			x = sc.nextInt();
		}
		System.out.println("Você conseguiu!!!");
		System.out.println("Resultado da soma dos números digitados: " + soma);
		
		sc.close();}

}
