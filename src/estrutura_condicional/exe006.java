package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exe006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
		Obviamente se o valor não estiver em nenhum destes intervalos, 
		deverá ser impressa a mensagem “Fora de intervalo”.*/
		
		double valorqualquer;
		System.out.println("Digite um valor: ");
		valorqualquer = sc.nextDouble();
		
		if(valorqualquer >= 0 && valorqualquer <= 25.00) {
			System.out.println("Intervalo [0 a 25]");
		}
		else if(valorqualquer >= 25.01 && valorqualquer <= 50.00) {
			System.out.println("Intervalo [25 a 50]");
		}
		else if(valorqualquer >= 50.01 && valorqualquer <= 75.00) {
			System.out.println("Intervalo [50 av75]");
		}
		else if(valorqualquer >= 75.01 && valorqualquer <= 100.00) {
			System.out.println("Intervalo [75 a 100]");
		}
		else {
			System.out.println("Fora de intervalo!");
		}
		sc.close();
	}

}
